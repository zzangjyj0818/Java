package Conditional_Loop;
import java.util.*;
public class StringSwitch {
    public static void main(String[] args) {
        String month;

        Scanner input = new Scanner(System.in);
        System.out.print("Input the Month : ");
        month = input.next();

        int monthNumber;
        switch (month){
            case "january":
                monthNumber = 1;
                break;
            case "februray":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            default:
                monthNumber = 0;
                break;

        }
        System.out.println(monthNumber);
    }
}
