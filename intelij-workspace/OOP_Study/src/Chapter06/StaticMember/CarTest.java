package Chapter06.StaticMember;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("S600", "white", 80);
        Car c2 = new Car("E500", "blue", 20);
        int n = Car.getNumbersOfCars();
        System.out.println(n);
    }
}
