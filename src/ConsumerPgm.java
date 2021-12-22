import java.util.function.Consumer;

public class ConsumerPgm {
    static Consumer<String> c1=(n)->
    {
        System.out.println("The Value User Passed is "+n);
    };

    public static void main(String[] args) {
        c1.accept("java8");
    }
}
