public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        AnimalTest t1 = new AnimalTest();
        t1.test(cat);
        t1.test(dog);
        //или так
        cat.say();
        dog.say();
    }

    public void test(Animal a) {
        a.say();
    }
}
