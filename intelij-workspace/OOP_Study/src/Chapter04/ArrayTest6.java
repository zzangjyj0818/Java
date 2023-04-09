package Chapter04;

import java.util.*;

public class ArrayTest6 {
    public static void main(String[] args) {
        int[][] array = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120}
        };

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.printf("[%d, %d] : %d\t", i,j,array[i][j]);
            }
            System.out.println("");
        }
    }
}
