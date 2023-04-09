package Chapter04;
import java.util.*;
public class SortExample {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];

        for(int i = 0; i<SIZE; i++){
            int r = (int)(Math.random()*100);
            numbers[i] = r;
        }
        System.out.print("First List : ");
        for(int r:numbers)
            System.out.print(r + " ");
        Arrays.sort(numbers);

        System.out.print("Sorted List : ");
        for(int r:numbers)
            System.out.print(r + " ");
    }
}
