import java.util.Locale;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
//        Print formatted output using printf function
//        to inject an argument to an output we have use printf
//        System.out.printf(format, arguments);
//        System.out.printf(locale, format, arguments);

//        %n: Take line leftovers
//        %[arg$][flags][width][.precision]conversion-character
//        Conversation character is required, [square brackets] are optional.

//        arg$: Optional. A number followed by a $ sign which indicates which of the
//        additional arguments to use, argument numbers start at 1,
//        This can be replaced with a < which specifies that the argument from
//        the previous placeholder should be used.

//        c: Character.
//        C: Uppercase character.
//        s: Strings.
//        S: Uppercase strings.
//        b: Boolean.
//        B: Uppercase boolean.
//        d: Decimal integers.
//        f: Floating-points numbers.
//        t: Date/time values.
//        flags: Common for formatting integers and floating-point numbers.
//        width: Represents the minimum number of characters written to the output.
//        precision: Define the length of a substring to extract from a string, also indicating how many decimal digits to show in the formatted data.
//        Flags, width, and precisions are optionals.

//        Flags
//        ,: Add decimal separator to the numbers.
//        -: Justify the output to the left, by adding any padding spaces to the right instead of the left.
//        +: Causes positive numbers to always be prefixed with "+".
//         : (A space character) Prefixes a space to positive numbers, primarily so that the digits can be lined up with the digits of negative numbers.
//        0: Pads numbers with zeroes on the left


        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name: ");
        String name = scanner.next();
        // Insert the name and take the line leftovers
        System.out.printf("Hello %s%n", name);

        // Print center with 15 character padding front and behind
        System.out.printf("%15s Center %15s.%n", "", "");

        // Adding decimals separators and define the localization of the format
        System.out.printf(Locale.US, "%,d %n", 10000000);
        System.out.printf(Locale.ITALY, "%,d %n", 10000000);


        // Example: write a program that reads a line of two data types (String, Integer)
        // then separate each data type to a different variable [Java 100 => x = java, y = 100].

        System.out.println("Enter:  Java 100");
        String x = scanner.next();
        int y = scanner.nextInt();
        System.out.println("x: " + x + ", y: " + y);
        scanner.close();
    }
}
