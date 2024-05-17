import java.util.Arrays;

public class Example31 {

    public static void main(String[] args) {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        int length = ages.length;

        int lowestAge = ages[0];

        for (int age : ages) {
            if (age < lowestAge) {
                lowestAge = age;
            }
            
        }

        System.out.printf("The lowest age in the array is: %s", lowestAge);
    }
}
