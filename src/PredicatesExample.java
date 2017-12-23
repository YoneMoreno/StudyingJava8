import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicatesExample {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three");

        Predicate<String> mapLength = string -> string.length() > 2;
        Predicate<String> IsTwo = Predicate.isEqual("two");
        Predicate<String> IsThree = Predicate.isEqual("three");

        stream  .filter(IsTwo.or(IsThree))
                .forEach(string -> System.out.println(string));
    }

}
