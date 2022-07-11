package Ali25;

public class Ali25Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
        dog.bark();
        dog.showName();
    }
}
