import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example37 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < T; i++) {
            String result = "";
            String txt = bufferedReader.readLine();
            StringBuilder lhs = new StringBuilder();
            StringBuilder rhs = new StringBuilder();
            for (int j = 0; j < txt.length(); j++) {
                if (j % 2 == 0) {
                    lhs.append(txt.charAt(j));
                } else {
                    rhs.append(txt.charAt(j));

                }
            }

            System.out.println(lhs + " " + rhs);
        }

        bufferedReader.close();
    }
}
