package Lesson11;

import java.util.Scanner;

public class Rectangle {
    public double side1;
    public double side2;
    public static double areaCalculator(double side1, double side2) {
        double area = side1 * side2;
        return area;
    }
    public static double perimetrCalculator(double side1, double side2) {
        double perimetr = 2 * (side1 + side2);
        return perimetr;
    }
    public static void main(String[] args) {
        Scanner consol = new Scanner(System.in);
        System.out.println(" Введите две длины сторон прямоугольника ");
        double side1 = consol.nextDouble();
        double side2 = consol.nextDouble();
        double area = areaCalculator(side1, side2);
        double perimetr = perimetrCalculator(side1, side2);
        System.out.println(" Площадь прямоугольника " + area);
        System.out.println(" периметр прямоугольника " + perimetr);
    }
}


// В теле класса создать два поля, описывающие длины сторон double side1, double side2.
// Создать два метода, вычисляющие площадь прямоугольника –
// double areaCalculator (double side1, double side2) и
// периметр прямоугольника – double perimeterCalculator (double side1, double side2).
// Написать программу,
// которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.