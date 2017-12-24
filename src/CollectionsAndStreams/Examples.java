package CollectionsAndStreams;

import java.util.Arrays;
import java.util.List;

public class Examples {
    public static void main(String[] args) {
        List<String> strings = getStrings();
        printStrings(strings);
    }

    private static void printStrings(List<String> strings) {
        strings.forEach(System.out::println);
    }

    private static List<String> getStrings() {
        return Arrays.asList("yi", "er", "san");
    }
}
