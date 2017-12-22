import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumersLambda {


    public static void main(String[] args) {


        List<String> strings = Arrays.asList("one", "two", "three");

        ArrayList<Object> result = new ArrayList<>();

        Consumer<String> myConsumer = System.out::println;

        strings.forEach(myConsumer);
    }
}
