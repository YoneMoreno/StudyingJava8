package Numbers;

import java.util.function.BinaryOperator;

public class ex {
    public static void main(String[] args) {
        long max = Long.max(1L, 2L);
        long min = Long.min(1000L, 2000L);
        System.out.println(max);
        System.out.println(min);

        BinaryOperator<Long> sum  = Long::sum;
        System.out.println(sum.apply(max,min));
    }
}
