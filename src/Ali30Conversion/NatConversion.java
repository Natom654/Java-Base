package Ali30Conversion;

public class NatConversion {
    public static void main(String[] args) {
        float f = 123.2F;
        long l = 123123123123l;
        int a = 123;
        long h = a;
        int x = (int) h;
        System.out.println(h);
        System.out.println("--------------------");
        int b = 123;
        double z = b;
        double y = 133.6;
        double g = 133.2;
        int d = (int) y;
        System.out.println(y);
        long t = Math.round(y);
        long n = Math.round(g);
        System.out.println(t);
        System.out.println(n);
        System.out.println("--------------------");
        byte k = (byte) 128;
        System.out.println(k);
    }
}
