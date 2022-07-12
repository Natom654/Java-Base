package Ali26;

public class Ali26Interface {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Rob");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
        Info info1 = new Animal(2);
        Info info2 = new Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);
        outputInfo(info1);
        outputInfo(info2);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
