import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumersLambda {


    public static void main(String[] args) {


        List<String> strings = Arrays.asList("one", "two", "three");

        ArrayList<Object> result = new ArrayList<>();

        Consumer<String> printConsumer = System.out::println;
        Consumer<String> insertConsumer = result::add;


        strings.forEach(printConsumer.andThen(insertConsumer));
        System.out.println("El tamaño de la lista, list's size is: " + result.size());
    }
}
