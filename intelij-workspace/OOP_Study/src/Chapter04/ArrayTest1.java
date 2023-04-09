package Chapter04;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] s = new int[10];

        for(int i = 0; i<10; i++)
            s[i] = i;

        for(int i = 0; i<10; i++)
            System.out.println(s[i]);
    }
}
