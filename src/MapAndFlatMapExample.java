import java.util.Arrays;
import java.util.List;

public class MapAndFlatMapExample {

    public static void main(String[] args) {

        List<Integer> allList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> evenList = Arrays.asList(2, 4, 6);
        List<Integer> oddList = Arrays.asList(1, 3, 5, 7);

        List<List<Integer>> list = Arrays.asList(allList, evenList, oddList);

        System.out.println(list);

        list.stream()
                .map(l -> l.size())
                .forEach(System.out::println);
    }
}
