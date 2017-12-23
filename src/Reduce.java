import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 10, 20);

        Integer target =
                list.stream()
                        .reduce(0, Integer::sum);

        System.out.println("El resultado es: " + target);

    }
}
