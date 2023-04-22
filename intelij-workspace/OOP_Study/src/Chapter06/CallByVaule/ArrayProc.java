package Chapter06.CallByVaule;

import java.util.Scanner;

public class ArrayProc {
//    void inc(int[] array){
//        for(int i = 0; i<array.length; i++)
//            array[i] += 1;
//    }
    public void getValues(int[] array){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<array.length; i++) {
            System.out.print("Input the Score : ");
            array[i] = scan.nextInt();
        }
    }
    public double getAverage(int[] array){
        double total = 0;
        for(int i = 0; i<array.length; i++)
            total += array[i];
        return total/array.length;
    }
}
