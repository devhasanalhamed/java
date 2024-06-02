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


        Map<String, String> addressBook = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String record = bufferedReader.readLine();
            var records = record.trim().split(" ");
            addressBook.put(records[0], records[1]);
        }

        String name;
        while ((name = bufferedReader.readLine()) != null) {
            System.out.println(name);
            if (name.isBlank()) break;
            System.out.println(addressBook.get(name) == null ? "Not found" : name + "=" + addressBook.get(name));
        }
    }
}
