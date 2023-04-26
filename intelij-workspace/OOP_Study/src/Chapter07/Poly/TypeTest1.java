package Chapter07.Poly;

class A{
    A() {}
}
class B extends A{
    B() {}
}
public class TypeTest1 {
    public static void main(String[] args) {
        A a = new B();
    }
}
