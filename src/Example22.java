import java.security.spec.ECField;

public class Example22 {
//    Exceptions
    /*
    When executing Java code, different errors can occur:
    coding errors made by the programmer, errors due
    to wrong input, or other unforeseeable things.
     */

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("An error occurred " + e);
        } finally {
            System.out.println("Try catch is finished!");
        }

        /*
        The throw statement allows you to create a custom error.
        The throw statement is used together with an exception type.
        There are many exception types available in Java:
        ArithmeticException, FileNotFoundException,
        ArrayIndexOutOfBoundsException, SecurityException, etc:
         */

        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
