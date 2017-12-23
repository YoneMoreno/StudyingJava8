package StreamExamples.PersonProcessingExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CollectorsExample {

    public static void main(String... args) {

        List<Person> persons = createPersonList();

        readPersonData(persons);

        printYoungerPersonWhichHas20orMore(persons);


        getMapFromPersonGroupedByAge(persons);
    }

    private static List<Person> createPersonList() {
        return new ArrayList<>();
    }

    private static void readPersonData(List<Person> persons) {
        try (
                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(
                                        CollectorsExample.class.getResourceAsStream("people.txt")));

                Stream<String> stream = reader.lines()
        ) {

            populatePersonList(persons, stream)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getMapFromPersonGroupedByAge(List<Person> persons) {
        Map<Integer, String> map =
                persons.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getAge,
                                        Collectors.mapping(
                                                Person::getName,
                                                Collectors.joining(", ")
                                        )
                                )
                        );
        System.out.println(map);
    }

    private static void printYoungerPersonWhichHas20orMore(List<Person> persons) {
        Optional<Person> opt =
                persons.stream().filter(p -> p.getAge() >= 20)
                        .min(Comparator.comparing(Person::getAge));
        System.out.println("El más joven de entre los que tienen 20 años o más es: " + opt.get().getName() + ", " + opt.get().getAge() + " años");
    }

    private static Stream<Person> populatePersonList(List<Person> persons, Stream<String> stream) {
        return stream.map(line -> {
            String[] s = line.split(" ");
            Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
            persons.add(p);
            return p;
        });
    }
}

