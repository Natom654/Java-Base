package Lesson11;

import java.util.Arrays;

public class Computer {
    public String computer;

    public void SetComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computer='" + computer + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();
        computers[0].SetComputer("Комп1");
        computers[1].SetComputer("Комп2");
        computers[2].SetComputer("Комп3");
        computers[3].SetComputer("Комп4");
        computers[4].SetComputer("Комп5");
        System.out.println(Arrays.toString(computers));
    }
}


// Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов
//
//Computers размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер