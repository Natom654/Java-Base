package Ali39Exception3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ali39Exception3 {
    public static void main(String[] args) {
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("file not found ");
        }
        // unchecked
        int a = 1 / 0;

        String name = null;
        name.length();

        int[] arr = new int[2];
        System.out.println(arr[3]);
    }
}
