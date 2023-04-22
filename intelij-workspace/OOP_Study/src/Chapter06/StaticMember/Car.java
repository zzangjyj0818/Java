package Chapter06.StaticMember;

public class Car {
    private String model;
    private String color;
    private int speed;

    private int id;
    private static int numbers = 0;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.id = ++numbers;
    }
    public static int getNumbersOfCars(){
        return numbers;
    }
}
