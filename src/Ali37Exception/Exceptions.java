package Ali37Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        File file = new File("abc");
        try {
            readFile();
            //Scanner scanner = new Scanner(file);
            // System.out.println(" after Scanner");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        // System.out.println("After try and catch");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("abc");
        Scanner scanner = new Scanner(file);
    }
}
