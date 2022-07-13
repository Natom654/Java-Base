package Zoo;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add(0, "wolf");
        list.add(1, "elephant");
        list.add(2, "tiger");
        list.add(3, "lion");
        list.add(4, "cat");
        list.add(5, "dog");
        list.add(6, "horse");
        list.add(7, "pig");
        System.out.println(list.size());
        System.out.println(list);
    }
}
