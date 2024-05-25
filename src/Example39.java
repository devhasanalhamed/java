import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example39 {
    //    Hackerrank day 8
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        Stream<String> names = Stream.of("Alice", "Bob", "Charlie");
        Map<String, String> myMap = new HashMap<>();

        Map<String, Integer> nameLengths = names.collect(Collectors.toMap(name -> name, String::length));

        System.out.println(nameLengths);
        for (int i = 0; i < n; i++) {
            var x = Stream.of(bufferedReader.readLine().split("")).collect(Collectors.toMap(name -> name, String::length));
            System.out.println(x);
        }
    }
}
