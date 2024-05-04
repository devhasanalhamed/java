public class example6 {
    static void myMethod() {
        System.out.println("Function just executed!");

    }

    // Overloading a function with different parameters

    static int calc(int x, int y) {
        return x + y;
    }

    static double calc(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod();
        int r = calc(2, 3);
        System.out.println(r);
        double r1 = calc(2.0, 3.0);
        System.out.println(r1);
    }
}
