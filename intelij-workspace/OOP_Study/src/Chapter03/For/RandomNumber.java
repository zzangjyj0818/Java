package Chapter03.For;
import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("난수의 개수: ");
        int count = input.nextInt();
        int sum = 0;

        for(int i = 0; i<count; i++){
            int number = generator.nextInt(100);
            sum += number;
        }
        System.out.println(sum);

    }
}
