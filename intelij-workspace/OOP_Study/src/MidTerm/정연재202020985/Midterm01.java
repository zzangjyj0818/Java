package MidTerm.정연재202020985;
import java.util.Scanner;

public class Midterm01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("width of square : ");
        int a = sc.nextInt();

        System.out.print("height of square : ");
        int b = sc.nextInt();

        double s = a*b;
        double w = (2 * a) + (2 * b);

        System.out.println("Area of square : " + s);
        System.out.println("Length of square : " + w);
    }
}
