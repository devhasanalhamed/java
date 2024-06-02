
import java.util.Scanner;

public class example1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            int a = scanner.nextInt();
            System.out.println(a);
            int b = scanner.nextInt();
            System.out.println(b);
            int n = scanner.nextInt();
            System.out.println(n);
            int accumulator = 0;
            for (int j = 0; j < n; j++){
                int result = (int) (accumulator + (Math.pow(2,j) * b));
                accumulator = result;
                System.out.print(result + a + " ");
            }
            System.out.println();
        }
    }
}