package 정연재202020985;

public class Midterm06 implements Flyable, Drivable{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void drive() {
        System.out.println("I'm driving");
    }

    public static void main(String[] args) {
        Midterm06 obj = new Midterm06();
        Flyable a = obj;
        Drivable b = obj;

        a.fly();
        b.drive();
    }
}
