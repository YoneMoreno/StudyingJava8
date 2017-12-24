package Numbers;

import java.util.function.BinaryOperator;

public class ex {
    public static void main(String[] args) {
        long max = Long.max(1L, 2L);
        long min = Long.min(1000L, 2000L);
        System.out.println(max);
        System.out.println(min);

        BinaryOperator<Long> sum  = Long::sum;
        Long apply = sum.apply(max, min);
        System.out.println(apply);


        long l = 12983476555555555L;
        int hash = Long.hashCode(l);
        System.out.println(hash);
    }
}
