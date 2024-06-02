import java.io.*;
import java.util.*;
import java.util.stream.*;


public class Example38 {
    //    Hackerrank day 7
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}