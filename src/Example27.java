import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example27 {
    //    Java files

    public static void main(String[] args) {
        String path = "c:\\Users\\admin\\desktop";

        try {
            File myFile = new File(path + "\\hasan.txt");
            if (myFile.createNewFile()) {
                /// Creating file

                System.out.println("File created:" + myFile.getName());
            } else {
                /// Run twice to write in a file

                System.out.println("File already exists.");
                System.out.println("--------  Writing data... -------- ");
                FileWriter myWrite = new FileWriter(path + "\\hasan.txt");
                myWrite.write("Files in Java might be tricky, but it is fun enough!");
                myWrite.close();
                System.out.println("-------- File writing completed successfully! --------");

            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            /// Read files

            File myFile = new File(path + "\\hasan.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while writing");
            e.printStackTrace();
        }

        File myFile = new File(path + "\\hasan.txt");
        if (myFile.exists()) {
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File size in bytes: " + myFile.length());
        } else {
            System.out.println("The file does not exits.");
        }

        System.out.println("It's up to you know, do you want to delete?[Yse,No]: ");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("-------- Deleting File --------");
            if (myFile.delete()) {
                System.out.printf("Delete this file: %s", myFile.getName());

            } else {
                System.out.println("Failed to delete the file");
            }

        } else {
            System.out.println("Your file is safe 🥳");
        }

        /// Create and delete directory

        File myDir = new File("C:\\Users\\admin\\desktop\\dir");
        if (myDir.mkdir()) {
            System.out.println("directory created!");
        }

        if (myDir.delete()) {

            System.out.println("Directory deleted!");
        }
    }
}
