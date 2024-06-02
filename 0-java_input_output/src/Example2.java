import java.util.Locale;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args){
//        Print formatted output using printf function
//        to inject an argument to an output we have use printf
//        System.out.printf(format, arguments);
//        System.out.printf(locale, format, arguments);

//        %n: take line leftovers
//        %[flags][width][.precision]conversion-character
//        conversation character is required
//        c: character
//        C: uppercase character
//        s: strings
//        S: uppercase strings
//        b: boolean
//        B: uppercase boolean
//        d: decimal integers
//        f: floating-points numbers
//        t: date/time values
//        flags: common for formatting integers and floating-point numbers
//        width: represents the minimum number of characters written to the output.
//        precision: define the length of a substring to extract from a string
//        flags, width, and precisions are optionals

//        Flags
//        ,: add decimal separator to the numbers
//        -: justify the output to the left

        Scanner scanner = new Scanner(System.in);


        String name = scanner.next();
        // insert the name and take the line leftovers
        System.out.printf("Hello %s%n", name);

        // print center with 15 character padding front and behind
        System.out.printf("%15s Center %15s.%n", "", "");

        // adding decimals separators and define the localization of the format
        System.out.printf(Locale.US, "%,d %n", 10000000);
        System.out.printf(Locale.ITALY, "%,d %n", 10000000);
    }
}
