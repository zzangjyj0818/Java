package Chapter09.Lamda;
@FunctionalInterface
interface MyInterface{
    void sayHello();
}
public class LamdaTest1 {
    public static void main(String[] args) {
        MyInterface hello = ()-> System.out.println("Hello");
        hello.sayHello();
    }
}
