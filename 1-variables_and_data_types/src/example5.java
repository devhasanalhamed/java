import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        /*
        Java divides the operators into the following groups:

        Arithmetic operators
            perform common arithmetic
        Assignment operators
            assign values to a variable
        Comparison operators
            compare between variables and return true or false
        Logical operators
            test for true or false with logical operators
        Bitwise operators
         */

        System.out.println("Escape \"Text\"");

        String[] arr = {"Hasan", "Fatima", "Maha", "Saleh"};
        for (String var : arr) {
            System.out.println(var);
        }

        System.out.println(Math.max(5.55, 3));
        System.out.println(Math.sqrt(25));

        for (int i = 0; i < 10; i++) {
            if (i == 4 || i == 3) {
                continue;
            }
            System.out.print(i);
        }

        // Arrays
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
//        String x = System.console().readLine();
        Scanner scan = new Scanner(System.in);
        final String x = scan.nextLine();
        System.out.println("Hello, World.");
        System.out.println(x);


    }
}
