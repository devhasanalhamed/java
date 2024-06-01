import java.io.*;


public class Example40 {

    public static int factorial(int n) {
        if (n == 1) return 1;
        else if (n == 0) return 0;
        return n * factorial(n - 1);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = factorial(n);
        System.out.println(result);
        bufferedReader.close();
    }
}