import java.util.Scanner;

public class Distance {
    public static double distancemetr;
    public static double distancekm;
    public static double distanceml;
    static final double M = 0.00062137;

    public void print() {
        System.out.println("distance  is " + distancekm + " km, " + distanceml + " ml");
    }

    public static class Convertor {
        public static double Converter(double distancemetr) {
            distancekm = (distancemetr * 0.001);
            return (distancekm);
        }

        public static double Converter(double distancemetr, double M) {
            distanceml = (distancemetr * M) ;
            return distanceml;
        }
    }

    public static void main(String[] args) {
        Scanner consol = new Scanner(System.in);
        System.out.println("Enter distance in metres ");
        double distancemetr = consol.nextDouble();
        Distance.Convertor distancekm = new Distance.Convertor();
        distancekm.Converter(distancemetr);
        Distance.Convertor distanceml = new Distance.Convertor();
        distanceml.Converter(distancemetr, M);
        Distance d1=new Distance();
        d1.print();
    }
}


//�������� maven ������, ��������� IntelliJ IDEA,
// ���������� � �� ���� .gitignore. ������� ��� �� ������ �
// � ������� �������� ������ �� ������, ����� ������ ���� �� ������ � ������: dev.

// ������� ����� Distance � ����� distance ���� double � ������� print.
// � ������ Distance, ������?�� �����������? ����� Converter �
// ��������, ������� ����� �������������� ���������� � ������ ������� ��������� (� �������,
// �� ������ � ���������, �� ���������� � ����, � ��� �����).