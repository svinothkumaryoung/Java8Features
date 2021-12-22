import java.util.function.Predicate;

public class Predicate1 {
    static Predicate<Integer> int1=n->n>=18;

    public static void main(String[] args) {
        System.out.println(int1.test(18));
    }
}
