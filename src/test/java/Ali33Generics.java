import java.util.ArrayList;
import java.util.List;

public class Ali33Generics {
    public static void main(String[] args) {
        List animals = new ArrayList();
        Animal ouranimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("pig");
        animals.add(ouranimal);

        String animal = (String) animals.get(3);
        System.out.println(animal);
        //
        List<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("pig");
        //animals2.add(ouranimal);
        String animal2 = animals2.get(1);
        //
        List<String> animals3 = new ArrayList<>();
    }
}

class Animal {
}
