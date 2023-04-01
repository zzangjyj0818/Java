public class Car {
    //멤버변수 선언
    String color;
    int speed;
    int gear;

    //결과 출력 메소드
    @Override
    public String toString() {
        return "Car [color =" + color +", speed = " + speed + ", gear = " + gear+" ]";
    }

    //기어변속 메소드
    void changeGear(int g){
        gear = g;
    }

    //가속 메소드
    void speedUp(){
        speed += 10;
    }

    //감속 메소드
    void speedDown(){
        speed -= 10;
    }
}
