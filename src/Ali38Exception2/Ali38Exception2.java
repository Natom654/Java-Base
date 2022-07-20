package Ali38Exception2;

import java.io.IOException;
import java.util.Scanner;

public class Ali38Exception2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new ScannerException("User enter not 0");
                //  try {
                //      throw new IOException();
                //  } catch (IOException e) {
                //      System.out.println("it is not 0");
            }
        }
    }
}
