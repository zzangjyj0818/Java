package Chapter07.InheritanceConstructor;

class Base{
    public Base(){
        System.out.println("Base() Constructor");
    }
}

class Derived extends Base{
    public Derived() {
        System.out.println("Derived() Constructor");
    }
}
public class Test {
    public static void main(String[] args) {
        Derived r = new Derived();
    }
}
