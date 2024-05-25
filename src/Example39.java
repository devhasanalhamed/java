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
        Map<String, String> myMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            var x = Stream.of().collect(Collectors.toMap(o -> "", ""));
        }
    }
}
