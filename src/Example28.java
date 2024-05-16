import java.util.Scanner;

public class Example28 {
//    Add two numbers with user input

    public static void main(String[] args) {
        int x, y, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        x = scanner.nextInt();

        System.out.println("Type another number: ");
        y = scanner.nextInt();

        sum = x + y;
        System.out.printf("Sum is: %s", sum);
    }
}
