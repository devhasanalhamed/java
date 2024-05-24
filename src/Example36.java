import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example36 {
    //    Hackerrank day 5
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i < 11; i++) {
            System.out.printf("%s x %s = %s \n", n, i, i * n);
        }

        bufferedReader.close();
    }
}
