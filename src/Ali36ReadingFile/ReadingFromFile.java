package Ali36ReadingFile;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import java.io.File;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "\\Users\\Natalia\\IdeaProjects\\Leson20\\tests";
        File file = new File(path);
        // String separator =File.separator;
        //String path = separator +"Users"+ separator +"Natalia"+ separator +"IdeaProjects"+ separator +"leson20"+ separator+"tests";

        Scanner scanner = new Scanner(file);

        //  while (scanner.hasNextLine()) {
        //  System.out.println(scanner.nextLine());
        //  }

        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
