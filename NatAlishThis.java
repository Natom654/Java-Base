package Lesson11;

public class NatAlishThis {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(25);
        human1.setName("Dima");
        human1.getInfo();
        Human human2 = new Human();
        human1.setAge(48);
        human1.setName("Masha");
        human1.getInfo();
    }
}

class Human {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}



