import java.util.ArrayList;
import java.util.function.Consumer;

public class Example26 {
//    Lambda Expressions
    /*
    A lambda expression is a short block of code
    which takes in parameters and returns a value.
     */

    public static void main(String[] args) {
        final ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(8);
        numList.add(16);
        numList.add(64);
        numList.add(32);
        numList.forEach((n) -> System.out.println(n));

        // Lambda can be stored using consumer

        Consumer method = (x) -> System.out.println(x);

        numList.forEach(method);

    }
}
