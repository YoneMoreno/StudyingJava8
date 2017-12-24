package Strings;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class StringsEx {
    public static void main(String[] args) {

        String s = getString();
        IntStream chars = getIntStream(s);
        applyUpperCase(chars);

        StringJoiner stringJoiner = getStringJoiner();
        composeString(stringJoiner);
        String s1 = convertToString(stringJoiner.toString());
        newLine();
        printString(s1);

        StringJoiner sjWithPrefixSufix = getStringJoinerPrefixSuffix();
        String s2 = convertToString(sjWithPrefixSufix.toString());
        printString(s2);


    }

    private static StringJoiner getStringJoinerPrefixSuffix() {
        return new StringJoiner(", ", "{", "}");
    }

    private static void printString(String s1) {
        System.out.println(s1);
    }

    private static void newLine() {
        System.out.println();
    }

    private static String convertToString(String s2) {
        return s2;
    }

    private static void composeString(StringJoiner stringJoiner) {
        stringJoiner.add("one").add("two").add("three");
    }

    private static StringJoiner getStringJoiner() {
        return new StringJoiner(", ");
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
