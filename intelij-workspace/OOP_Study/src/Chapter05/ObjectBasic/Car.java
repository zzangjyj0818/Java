package Chapter05.ObjectBasic;

public class Car {
    String color;
    int speed;
    int gear;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }
    void changeGear(int g){
        gear = g;
    }
    void speedUp(){
        speed += 10;
    }
    void speedDown(){
        speed -= 10;
    }
}
