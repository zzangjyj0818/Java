package Chapter09.StaticMethod;

interface MyInterface{
    static void print(String msg){
        System.out.println(msg);
    }
}
public class StaticMethodTest {
    public static void main(String[] args) {
        MyInterface.print("Java 8");
    }
}
