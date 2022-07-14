package Lesson11;

import java.util.Scanner;

public class Bet {
    private int bet;
    private int risk;

    public Bet(int bet, int risk) {
        this.bet = bet;
        this.risk = risk;
    }

    public void SetBet(int bet) {
        this.bet = bet;
    }

    public void SetRisk(int risk) {
        this.risk = risk;
    }

    public int getBet() {
        return bet;
    }

    public int getRisk() {
        return risk;
    }

    public static void main(String[] args) {
        System.out.println("Введите ставку и риск");
        Scanner cons = new Scanner(System.in);
        int bet = cons.nextInt();
        int risk = cons.nextInt();
        Bet bet1 = new Bet(bet, risk);
        System.out.println("Cтавка равна " + bet1.getBet() + "  гривен, риск -" + bet1.getRisk() + "%");
    }
}


// Задание 5: создайте класс Bet (ставка),
// напишите два поля, значение ставки и риск, введите и выведите их с клавиатуры,
// напишите геттеры и сеттеры, конструктор