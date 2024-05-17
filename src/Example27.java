import java.util.HashMap;

public class Example27 {

    public static int repetitions(String s) {
        final String[] arr = s.split("");
        int repeat = 1;
        String chr = " ";
        int localCounter = 1;
        for (String letter : arr) {
            if (letter.equals(chr)) {
                localCounter += 1;
            } else {
                chr = letter;
                localCounter = 1;
            }

            if (localCounter > repeat) {

                repeat = localCounter;
            }
        }
        return repeat;
    }


    public static void main(String[] args) {
        final int result = repetitions("AAAAAAAAAA");
        System.out.println(result);


    }
}
