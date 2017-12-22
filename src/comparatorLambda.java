import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorLambda {
    public static void main(String[] args) {


        Comparator<String> stringComparator = new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        List<String> list = Arrays.asList("********", "**", "*", "");
        Collections.sort(list, stringComparator);

        for (String s :
                list) {
            System.out.println(s);
        }
    }
}