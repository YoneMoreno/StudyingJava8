package Strings;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class StringsEx {
    public static void main(String[] args) {

        String s = getString();
        IntStream chars = getIntStream(s);
        applyUpperCase(chars);

        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add("one").add("two").add("three");
        String s1 = stringJoiner.toString();
        System.out.println();
        System.out.println(s1);

    }

    private static void applyUpperCase(IntStream chars) {
        chars.mapToObj(letter -> (char) letter)
                .map(Character::toUpperCase)
                .forEach(System.out::print);
    }

    private static IntStream getIntStream(String s) {
        return s.chars();
    }

    private static String getString() {
        return "Hola mundo";
    }
}
