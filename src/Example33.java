import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example33 {


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

    public static String canForm(String source, String target) {
        final String[] arrSource = source.toLowerCase().split("");
        final String[] arrTarget = target.toLowerCase().split("");
        final List<String> listSource = Arrays.asList(arrSource);

        for (String letter : arrTarget) {
            if (listSource.contains(letter)) {
                continue;
            }
            return "no";
        }
        return "yes";
    }


    public static void main(String[] args) {
        final String result = canForm("Hubcoders", "coderhub");
        System.out.println(result);


    }
}
