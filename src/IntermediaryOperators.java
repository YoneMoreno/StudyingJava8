import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryOperators {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three");

        Predicate<String> IsTwo = Predicate.isEqual("two");
        Predicate<String> IsThree = Predicate.isEqual("three");

        List<String> list = new ArrayList<>();

//        stream
//                .peek(System.out::println)
//                .filter(IsTwo.or(IsThree))
//                .peek(list::add);

        stream
                .peek(System.out::println)
                .filter(IsTwo.or(IsThree))
                .forEach(list::add);


        System.out.println("Completado");
        System.out.println("El tamaño de la lista es: " + list.size());
    }

}
