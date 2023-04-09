package Chapter03.For;
import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        int answer = 59;
        int guess;
        Scanner input = new Scanner(System.in);
        int tries = 0;

        do{
            System.out.print("Input the Answer : ");
            guess = input.nextInt();
            tries++;

            if(guess > answer)
                System.out.println("guess > answer");
            else if(guess < answer)
                System.out.println("guess < answer");
        }while(guess != answer);

        System.out.printf("Try : %d | Answer : %d\n", tries, answer);
    }
}
