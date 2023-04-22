package Chapter06.CallByVaule;

public class ArrayProcTest {
    final static int STUDENTS = 5;
    public static void main(String[] args) {
        int[] scores = new int[STUDENTS];
        ArrayProc obj = new ArrayProc();

        obj.getValues(scores);
        System.out.printf("Average : %f\n", obj.getAverage(scores));
    }
}
