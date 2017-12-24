package Strings;

import java.util.stream.IntStream;

public class StringsEx {
    public static void main(String[] args) {

        String s = getString();
        IntStream chars = getIntStream(s);
        applyUpperCase(chars);
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
