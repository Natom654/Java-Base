public class Ali21Static {
    public static void main(String[] args) {
        Human h1 = new Human("Sam", 40);
        Human h2 = new Human("Tom", 30);
        h1.printnumberofPeople();
        h2.printnumberofPeople();
        Human h3 = new Human("Rob", 20);
        h3.printnumberofPeople();
    }
}

class Human {
    private String name;
    private int age;
    private static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printnumberofPeople() {
        System.out.println("Number of people  " + countPeople);
    }
}

