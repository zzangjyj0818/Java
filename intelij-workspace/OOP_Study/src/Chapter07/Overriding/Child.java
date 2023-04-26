package Chapter07.Overriding;

public class Child extends Parent{
    @Override
    public void print() {
        super.print();
        System.out.println("Child class print() method");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.print();
    }
}
