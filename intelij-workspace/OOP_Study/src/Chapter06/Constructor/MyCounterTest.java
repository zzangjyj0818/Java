package Chapter06.Constructor;

public class MyCounterTest {
    public static void main(String[] args) {
        MyCounter obj1 = new MyCounter(3);
        MyCounter obj2 = new MyCounter(4);

        System.out.println("obj1 : " + obj1.counter);
        System.out.println("obj2 : " + obj2.counter);
    }
}
