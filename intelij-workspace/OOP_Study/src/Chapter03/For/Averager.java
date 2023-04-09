package Chapter03.For;

import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        int total = 0, count = 0;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Input the Score : ");
            int grade = input.nextInt();
            if(grade < 0)
                break;
            total += grade;
            count++;
        }
        System.out.println("평균은 " + total/count);
    }
}
