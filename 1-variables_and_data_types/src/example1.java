
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
//        Java has 8 primitive datatypes
//        char, boolean,
//        byte, short, int, long,
//        float, double.
//
//        Integers: are a whole number, positive, negative, or zero
//        Signed integer: means that one of the bits in the byte
//        indicate whether the number is positive or negative
//        (MSB -> 0: positive, 1: negative).
//
//        With 8 bits, an unsigned byte (without a sign bit) can represent
//        values from 0 to 255 (2 raised to the power of 8 minus 1).

//        Because one bit is used for the sign, a signed byte
//        can represent values from -128 to 127.
//
//        Primitives that hold integer:
//        byte: 8 bit signed integer.
//        short: 16 bit signed integer.
//        int: 32 bit signed integer.
//        long: 64 bit signed integer.
//        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

        Scanner scanner = new Scanner(System.in);

        final int T = scanner.nextInt();

        int counter = 0;

        while(counter <= T){

            try{
                long number = scanner.nextLong();
                long testNumber = Math.abs(number);
                    System.out.printf("%s can be fitted in:%n", number);
                if(testNumber <= (Math.pow(2,8)) / 2){
                    System.out.println("* byte");
                }
                if(testNumber <= (Math.pow(2,16)) / 2){
                    System.out.println("* short");
                }
                if(testNumber <= (Math.pow(2,32)) / 2){
                    System.out.println("* int");
                }
                System.out.println("* long");
            }catch (InputMismatchException s) {
                System.out.print(scanner.next()+" can't be fitted anywhere.");
            }

            counter += 1;
        }
    }
}