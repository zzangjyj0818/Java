package Chapter09.MultipleInheritance;

interface Drivable{
    void drive();
}

interface Flyable{
    void fly();
}
public class FlyingCar1 implements Drivable, Flyable{
    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void drive() {
        System.out.println("Drive");
    }

    public static void main(String[] args) {
        FlyingCar1 obj = new FlyingCar1();
        obj.drive();
        obj.fly();
    }
}
