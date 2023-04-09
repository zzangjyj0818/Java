package Conditional_Loop.Conditional;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number : ");
        number = input.nextInt();

        if(number % 2 == 0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}
