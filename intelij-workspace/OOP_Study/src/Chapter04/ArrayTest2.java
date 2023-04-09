package Chapter04;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        final int STUDENTS = 5;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        int []scores = new int[STUDENTS];

        for(int i = 0; i< scores.length; i++){
            System.out.print("Input the Score : ");
            scores[i] = scan.nextInt();
        }

        for(int i = 0; i< scores.length; i++)
            total += scores[i];

        System.out.println(total/STUDENTS);
    }
}
