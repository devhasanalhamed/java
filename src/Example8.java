import java.util.Scanner;

public class Example8 {
    int x = 5;


    public static void main(String[] args) {
        Example8 myObj1 = new Example8();
        Example8 myObj2 = new Example8();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        Scanner scan = new Scanner(System.in);
        String s = (String) scan.nextLine();
        int i = (int) scan.nextInt();
        double d = (double) scan.nextDouble();
        System.out.println(i + 4);
        System.out.println(d + 4);
        System.out.println("HackerRank " + s);

    }

}
