package Chapter09.Problem;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("사각형의 가로를 입력하시요 : ");
        int a = scan.nextInt();

        System.out.print("사각형의 세로를 입력하시요 : ");
        int b = scan.nextInt();

        double s = a*b;
        double w = (2 * a) + (2 * b);

        System.out.println("사각형의 넓이는 " + s + "입니다.");
        System.out.println("사각형의 둘레는 " + w + "입니다.");
    }
}
