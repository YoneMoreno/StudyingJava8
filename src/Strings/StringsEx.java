package Strings;

import java.util.stream.IntStream;

public class StringsEx {
    public static void main(String[] args) {

        String s = "Hola mundo";
        IntStream chars = s.chars();

        chars.mapToObj(letter -> (char)letter)
                .map(Character::toUpperCase)
                .forEach(System.out::print);
    }
}
