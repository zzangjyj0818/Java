import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {

        // 에외(Exceptions)
        // 예상할 수 있는 에러를 예외라고 함


        // 예외 처리를 해줘야 프로그램이 매끈하게 돌아감

        ArrayList arrayList = new ArrayList(3);

        // try catch finally 구문
        // try : 오류가 날 것 같은 구문
        // catch(Exception e) : 오류문구 출력
        // catch 는 여러개를 사용해도 됨
        // finally : 무조건 실행할 구문

        try {
//            arrayList.get(10);
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch(IndexOutOfBoundsException ioe) {
            System.out.println("IndexOutOfBoundsException 발생");
        } catch(IllegalArgumentException iae){
            System.out.println("IllegalArgumentException 발생");
        } catch (Exception e){
            System.out.println("Exception 발생");
        } finally {
            System.out.println("Finally");
        }
    }
}
