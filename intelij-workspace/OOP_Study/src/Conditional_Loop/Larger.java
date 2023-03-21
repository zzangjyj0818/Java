package Conditional_Loop;

import java.util.*;

public class Larger {
    public static void main(String[] args) {
        int x, y, max;

        Scanner input = new Scanner(System.in);
        System.out.print("First Number : ");
        x = input.nextInt();
        System.out.print("Second Number : ");
        y = input.nextInt();

        if(x>y)
            max = x;
        else
            max = y;

        System.out.printf("Max : %d", max);
    }
}
