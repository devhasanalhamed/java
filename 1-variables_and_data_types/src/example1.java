import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
//        Standard Input, Standard Output
//        There are several methods to read an input from the user
//        Method 1: Scanner
//        Method 2: BufferedReader

        // Specifying the Input Stream as System.in
        Scanner scanner = new Scanner(System.in);

        /*
         BufferedReader also specifying input stream as System.in
         not to use the buffered reader we need either to
         1: add exception to the method signature (main throws IOException)
         2: surround with try catch
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        // Scanner
        System.out.print("Enter a number using scanner: ");
        int readIntegerUsingScanner = scanner.nextInt();
        System.out.println("readIntegerUsingScanner = " + readIntegerUsingScanner);


        // BufferedReader
        int readIntegerUsingBufferedReader;
        try {
            System.out.print("Enter a number using bufferedReader: ");
            readIntegerUsingBufferedReader = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Error reading integer using buffered reader");
            throw new RuntimeException(e);
        }
        System.out.println("readIntegerUsingBufferedReader = " + readIntegerUsingBufferedReader);

//      Now we know how to use input classes to read input from the user

        /*
        Note: If you use the nextLine() method immediately following the nextInt()
        method, recall that nextInt() reads integer tokens; because of this, the last
        newline character for that line of integer input is still queued in the input buffer
        and the next nextLine() will be reading the remainder of the integer line (which is empty).

        Workaround:
        Method 1: consume the next line immediately following nextXXX()
            int i = scanner.nextInt();
            scanner.nextLine(); // consume new line leftovers
            int txt = scanner.nextLine();

        Method 2: always use the whole line and parse it to the wanted value
            int i = Integer.parse(scanner.nextLine());
         */

        scanner.nextLine(); // consume line leftovers
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(
                "Hello developer " + name + " your numbers are " +
                        readIntegerUsingScanner + " and " + readIntegerUsingBufferedReader
        );

//      Exercise: create a program that takes a username and age then print it to console

        System.out.println("--------------------------------------------------");
        System.out.print("Hello user, please enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("enter your age: ");
        int userAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Hello " + userName + " your age is " + userAge + " years.");
    }
}