package Chapter03.For;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number : ");
        n = input.nextInt();

        for(int i = 1; i<=n; i++)
            fact *= i;

        System.out.println(fact);
    }
}
