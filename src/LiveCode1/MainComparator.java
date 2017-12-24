package LiveCode1;


import java.util.function.Function;

/**
 * @author José Paumard
 */
public class MainComparator {

    public static void main(String... args) {

        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());

        Function<Person, Integer> fAge = p -> p.getAge();
        Function<Person, String> fFirstName = p -> p.getFirstName();
        Function<Person, String> fLastName= p -> p.getLastName();

        Comparator<Person> cmpPerson = Comparator.comparing(Person::getAge);

    }
}