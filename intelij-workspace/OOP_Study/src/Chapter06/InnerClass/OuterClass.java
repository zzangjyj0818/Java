package Chapter06.InnerClass;

public class OuterClass {
    private int value = 10;

    class InnerClass{
        public void myMethod(){
            System.out.println("Value of Outer Class : " + value);
        }
    }
    OuterClass(){
        InnerClass obj = new InnerClass();
        obj.myMethod();
    }
}
