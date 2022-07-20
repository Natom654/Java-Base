package Ali35Anonimus;

interface AabletoEat {
    public void eat();
}

public class Test {
    public static void main(String[] args) {
        AabletoEat aabletoEat = new AabletoEat() {
            @Override
            public void eat() {
                System.out.println("Someanimal is eating  ");
            }
        };
        aabletoEat.eat();

    }
}
