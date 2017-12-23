package Time.DataAndTimeCompleteExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author José
 */
public class DataAndTime {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        readPersonFile(persons);

        LocalDate now = LocalDate.now();

        printYearAndMonthsFromBirthdayToNow(persons, now);


    }

    private static void printYearAndMonthsFromBirthdayToNow(List<Person> persons, LocalDate now) {
        persons.stream().forEach(
                p -> {
                    Period between = Period.between(p.getDateOfBirth(), now);
                    System.out.println(p.getName() + " nacio hace: " +
                            between.get(ChronoUnit.YEARS) + " años y " +
                            between.get(ChronoUnit.DAYS) + " meses " +
                            "[" + p.getDateOfBirth().until(now, ChronoUnit.MONTHS)
                            + " meses}"
                    );
                }
        );
    }

    private static void readPersonFile(List<Person> persons) {
        try (
                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(
                                        DataAndTime.class.getResourceAsStream("people.txt")));
                Stream<String> stream = reader.lines();
        ) {

            createPersonFromFileDataAndAddItToList(persons, stream);

        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private static void createPersonFromFileDataAndAddItToList(List<Person> persons, Stream<String> stream) {
        stream.map(
                line -> {
                    String[] s = line.split(" ");
                    String name = s[0].trim();
                    int year = Integer.parseInt(s[1]);
                    Month month = Month.of(Integer.parseInt(s[2]));
                    int day = Integer.parseInt(s[3]);
                    Person p = new Person(name, LocalDate.of(year, month, day));
                    persons.add(p);
                    return p;
                })
                .forEach(System.out::println);
    }
}