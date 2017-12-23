import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 10, 20);

        Optional<Integer> target =
                list.stream()
                        .reduce(Integer::max);

        System.out.println("El resultado es: " + target);

    }
}
