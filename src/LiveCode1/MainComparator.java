package LiveCode1;


import java.util.function.Function;

/**
 * @author José Paumard
 */
public class MainComparator {

    public static void main(String... args) {

        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();

    }
