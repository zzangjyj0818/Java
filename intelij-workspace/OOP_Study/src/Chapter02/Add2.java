package Chapter02;
import java.util.*;
public class Add2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int sum;

        System.out.println("Input the First number : ");
        x = input.nextInt();

        System.out.println("Input the Second number : ");
        y = input.nextInt();

        sum = x+y;

        System.out.println(sum);


    }
}
