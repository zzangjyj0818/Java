public class BadIndex2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = 0;
        try {
            int result = array[12];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스가 잘못되었습니다.");
        } finally {
            System.out.println("try/catch 구문 통과");
        }
        System.out.println("과연 이 문장이 실행될까요?");
    }
}