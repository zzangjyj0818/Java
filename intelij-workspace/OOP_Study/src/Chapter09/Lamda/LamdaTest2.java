package Chapter09.Lamda;
@FunctionalInterface
interface MyInterface2{
    public void caculate(int x, int y);
}
public class LamdaTest2 {
    public static void main(String[] args) {
        MyInterface2 hello = (a,b)->{
            System.out.println(a+b);
        };
        hello.caculate(1,3);
    }
}
