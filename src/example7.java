public class example7 {
    // Recursion function to achieve factorial
    static int recursion(int num) {
        if (num > 0) {
            return num * recursion(num - 1);
        }
        return 1;
    }

    static int sumInRange(int start, int end) {
        if (end > start) {
            return end + sumInRange(start, end - 1);
        }
        return end;

    }


    public static void main(String[] args) {
        final int result = recursion(5);
        System.out.println(result);

        int result1 = 1;
        for (int i = 5; i > 0; i--) {
            result1 *= i;
        }
        System.out.println(result1);


        final int result2 = sumInRange(1, 3);
        System.out.println(result2);
    }
}
