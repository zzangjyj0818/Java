package Chapter05.ObjectBasic;

public class MathTest {

    public static void main(String[] args) {
        int sum;
        Math obj = new Math();
        sum = obj.add(2,3);
        System.out.println(sum);

        sum = obj.add(7,8);
        System.out.println(sum);
    }}
