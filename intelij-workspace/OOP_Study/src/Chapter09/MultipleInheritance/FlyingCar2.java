package Chapter09.MultipleInheritance;

//interface Flyable{
//    void fly();
//}
class Car{
    int speed;
    void setSpeed(int speed){
        this.speed = speed;
    }
}
public class FlyingCar2 extends Car implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fly");
    }

    public static void main(String[] args) {
        FlyingCar2 obj = new FlyingCar2();
        obj.setSpeed(300);
        obj.fly();
    }
}
