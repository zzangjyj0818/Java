package Chapter14;

//사용자가 정의한 예외
class MyException extends Exception{
    public MyException() {
        super("사용자 정의 예외");
    }
}
public class ExceptionTest1 {
    public static void main(String[] args) {
        try{
            method1();
        }catch (MyException e){
            System.err.println(e.getMessage() + "\n호출 스택 내용: ");
            e.printStackTrace();
        }
    }
    //사용자가 정의한 예외를 발생시키는 메서드
    public static void method1() throws MyException{
        throw new MyException();
    }
}
