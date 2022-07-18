package Ali34Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listofAnimal = new ArrayList<>();
        listofAnimal.add(new Animal(1));
        listofAnimal.add(new Animal(2));

        List<Dog> listofDogs = new ArrayList<>();
        listofDogs.add(new Dog());
        listofDogs.add(new Dog());

        test(listofAnimal);
        test(listofDogs);
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
            animal.eat();
        }
    }
}
