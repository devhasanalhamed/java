import java.util.Scanner;

public class Example35 {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        Person person = new Person(input);
        System.out.println(person.age);

    }


    public static class Person {
        int age;

        Person(int initialAge) {
            if (initialAge < 0) {
                age = 0;
                System.out.println("Age is not valid, setting age to 0");
            } else if (initialAge < 13) {
                age = initialAge;

                System.out.println("You are young.");
            } else if (initialAge < 18) {
                age = initialAge;

                System.out.println("You are a teenager.");
            } else {
                age = initialAge;

                System.out.println("You are old.");
            }
        }
    }

}



