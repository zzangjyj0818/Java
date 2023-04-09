package Chapter03.Loop;

import java.util.*;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, r;
        System.out.print("두 개의 정수를 입력하시오(큰수, 작은수) : ");
        x = input.nextInt();
        y = input.nextInt();

        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        System.out.println(x);
    }
}
