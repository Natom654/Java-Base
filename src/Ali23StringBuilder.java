public class Ali23StringBuilder {
    public static void main(String[] args) {
        String x = "Helloo";
        x = x.toUpperCase();
        System.out.println(x);
        System.out.println("------------");
        String string1 = "Hello ";
        String string2 = " my ";
        String string3 = "  friend";
        String StringAll = string1 + string2 + string3;
        System.out.println(StringAll);
        System.out.println("------------");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
        System.out.println("------------");
        System.out.printf("This is %s String %d\n", "Five", 5);
        System.out.printf("This is %s String %10d\n", "your", 532);
        System.out.printf("This is %s String %-10d\n", "our", 1000);
        System.out.printf("This %.2f is %s String %-5d\n", 5.3256, "our", 1000);
    }
}
