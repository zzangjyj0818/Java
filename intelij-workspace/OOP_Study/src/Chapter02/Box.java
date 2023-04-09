package Syntax;
import java.util.*;
public class Box {
    public static void main(String[] args) {
        double w,h,area,perimeter;

        Scanner input = new Scanner(System.in);

        System.out.println("Input the weight : ");
        w = input.nextInt();

        System.out.println("Input the height : ");
        h = input.nextInt();

        area = w*h;
        perimeter = 2.0 * (w+h);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
