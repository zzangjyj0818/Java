package Study;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("양의 정수를 입력하시요 : ");
            int a = scan.nextInt();

            if (a < 0) {
                System.out.println("양의 정수가 아닙니다.");
            } else {
                System.out.println(a + "의 약수는 다음과 같습니다.");

                for (int i = 1; i <= a; i ++) {
                    if (a % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            }
        }
    }
}
