package LiveCode1;



import java.util.function.Function;

/**
 *
 * @author José Paumard
 */
@FunctionalInterface
public interface Comparator<T> {

    public int compare(T t1, T t2);
    

}
