import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intlist = new ArrayList();
        intlist.add(0, 10);
        intlist.add(1, 20);
        intlist.add(2, 30);
        intlist.add(3, 40);
        intlist.add(4, 50);
        intlist.add(5, 60);
        intlist.add(6, 70);
        intlist.add(7, 80);
        intlist.add(8, 90);
        intlist.add(9, 100);
        System.out.println(intlist);

        for (int i = 0; i < intlist.size(); i++) {
            int oldVal = intlist.get(i);
            int newVal = oldVal + 1;
            intlist.set(i, newVal);
        }
        System.out.println(intlist);
    }
}


