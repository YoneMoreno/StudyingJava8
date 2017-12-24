package CollectionsAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        List<String> strings = getStrings();
        printStrings(strings);

        ArrayList<String> list = getListFrom(strings);
        removeIfStringLengthIsGreater(2,list);
        printJoining(list);

        ArrayList<String> listFrom = getListFrom(strings);
        toUpperCase(listFrom);
        printJoining(listFrom);
    }

    private static void toUpperCase(ArrayList<String> listFrom) {
        listFrom.replaceAll(String::toUpperCase);
    }

    private static void printJoining(ArrayList<String> list) {
        System.out.println(
                list.stream().collect(Collectors.joining(", "))
        );
    }

    private static void removeIfStringLengthIsGreater(int number,ArrayList<String> list) {
        boolean b = list.removeIf(s -> s.length() > number);
    }

    private static ArrayList<String> getListFrom(List<String> strings) {
        return new ArrayList<>(strings);
    }

    private static void printStrings(List<String> strings) {
        strings.forEach(System.out::println);
    }

    private static List<String> getStrings() {
        return Arrays.asList("yi", "er", "san");
    }
}
