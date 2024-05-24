import java.util.Arrays;

public class Example34 {


    public static void main(String[] args) {
        class Person {
            int age;

            Person(int initialAge) {
                if (initialAge < 0) {
                    age = 0;
                    System.out.println("Age is not valid, setting age to 0.");
                }
                age = initialAge;

            }

            void yearPasses() {
                age += 1;
            }

            void amIOld() {
                if (age < 13) {
                    System.out.println("You are young.");
                } else if (age < 18) {
                    System.out.println("You are teenager.");
                } else {
                    System.out.println("You are old.");
                }
            }

        }


    }
}
