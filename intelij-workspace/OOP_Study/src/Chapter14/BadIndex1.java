package Chapter14;

public class BadIndex1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for(int i = 0; i<10; i++)
            array[i] = 0;

        int result = array[12];
        System.out.println("과연 이 문장이 실행될까요?");
    }
}
