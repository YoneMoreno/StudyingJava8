import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapAndFlatMapExample {

    public static void main(String[] args) {

        List<Integer> allList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> evenList = Arrays.asList(2, 4, 6);
        List<Integer> oddList = Arrays.asList(1, 3, 5, 7);

        List<List<Integer>> list = Arrays.asList(allList, evenList, oddList);

        System.out.println(list);

        Function<List<?>, Integer> size = List::size;

        Function<List<Integer>, Stream<Integer>> flatMapper = l -> l.stream();

        list.stream()
                .flatMap(flatMapper)
                .forEach(System.out::println);

//        list.stream()
//                .map(size)
//                .forEach(System.out::println);
    }
}
