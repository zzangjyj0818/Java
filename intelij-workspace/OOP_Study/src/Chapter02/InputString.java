package Chapter02;
import java.util.*;
public class InputString {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner input = new Scanner(System.in);

        System.out.println("Input the Name : ");
        name = input.nextLine();

        System.out.println("Input the age : ");
        age = input.nextInt();

        System.out.println("Name : " + name + " Age : " + age);
    }
}
