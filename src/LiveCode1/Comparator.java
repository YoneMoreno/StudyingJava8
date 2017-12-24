package LiveCode1;


import java.util.function.Function;

/**
 * @author José Paumard
 */
@FunctionalInterface
public interface Comparator<T> {

    public int compare(T t1, T t2);

    public default Comparator<T> thenComparing(Comparator<T> cmp) {
        return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2) : compare(p1, p2);
    }

    public default Comparator<T> thenComparing(Function<T, Comparable> f) {
        return thenComparing(comparing(f));
    }

    public static <U> Comparator<U> comparing(Function<U, Comparable> f) {
        return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
    }

}
