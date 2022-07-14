import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bet {
    public static void main(String[] args) {
        while (true) {
            Scanner cons = new Scanner(System.in);
            System.out.println("Введите ваши ставки через пробел ");
            String str = cons.nextLine();
            String[] bet = str.split(" ");
            int[] betint = new int[bet.length];
            for (int i = 0; i < bet.length; i++) {
                if (str.equals("q")) {
                    try {
                        Integer.parseInt("q");
                    } catch
                    (NumberFormatException e) {
                        System.out.println("q не является допустимой ставкой");
                    }
                    break;
                }
                betint[i] = Integer.parseInt(bet[i]);
            }
            System.out.println(Arrays.toString(betint));
            Random rand = new Random();
            int randbet = rand.nextInt(betint.length);
            int bet1 = betint[randbet];
            int risk = (int) (5 + Math.random() * 20);
            System.out.println("Ваша ставка " + bet1 + " грн, сыграла. Риск составляет " + risk + "%");

        }
    }
}




