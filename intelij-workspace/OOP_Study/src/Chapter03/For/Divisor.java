package Chapter03.For;
import java.util.*;
public class Divisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the Number: ");
        int n = scan.nextInt();

        System.out.println("Result");
        for(int i = 1; i<=n; i++){
            if(n % i == 0)
                System.out.printf("%d ", i);
        }
    }
}
