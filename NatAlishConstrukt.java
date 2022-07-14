package Lesson11;

public class NatAlishConstrukt {

    public static void main(String[] args) {
        Human1 human1 = new Human1();
        Human1 human2 = new Human1("Маша");
        Human1 human3 = new Human1("Миша", 65);
    }
}

class Human1 {
    String name;
    int age;

    public Human1() {
        System.out.println("Привет из первого конструктора");
    }

    public Human1(String name) {
        this.name = name;
        System.out.println("Привет из второго конструктора");
    }

    public Human1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Привет из третьего компьютера");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
