import java.util.Scanner;
import mypack.MyPackageClass;
import forcePackage.TestCreatePackageByForce;

public class Example10 {
//    Packages
    /*
    A package in Java is used to group related classes.
     */

    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");


         String name = scanner.nextLine();
         
        System.out.println("Your name is: " + name);
        System.out.println("Hello and welcome to my App!");
    }
}
