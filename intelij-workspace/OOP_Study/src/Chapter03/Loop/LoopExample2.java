package Chapter03.Loop;

import java.util.*;

public class LoopExample2 {
    public static void main(String[] args) {
        int n, i = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
        n = scan.nextInt();
        while(i<=9){
            System.out.printf("%d * %d = %d\n", n, i, n*i);
            i++;
        }
    }
}
