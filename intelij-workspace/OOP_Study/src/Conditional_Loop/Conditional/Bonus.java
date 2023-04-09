package Conditional_Loop.Conditional;
import java.util.*;
public class Bonus {
    public static void main(String[] args) {
        final int targetSales = 1000;
        int mySales;
        int bonus;
        String result;

        Scanner input = new Scanner(System.in);
        System.out.print("Input the result : ");
        mySales = input.nextInt();

        if(mySales >= targetSales){
            result = "실적 달성";
            bonus = (mySales - targetSales) / 10;
        }
        else{
            result = "실적 달성 실패";
            bonus = 0;
        }

        System.out.println(result + "\n보너스: " + bonus);
    }
}
