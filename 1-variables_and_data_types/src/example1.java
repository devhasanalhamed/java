import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class example1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String txt = scanner.next();
            int num = scanner.nextInt();
            System.out.printf("%-15s%03d%n", txt, num);
        }
        System.out.println("================================");
    }
}