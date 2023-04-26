package Study;

public class CarTest {
    public static void main(String[] args) {

        Car obj1 = new Car("A3", "seoul");
        Car obj2 = new Car("busan");
        Car obj3 = new Car("A3", "china");

        int num = Car.getNumberOfCars();
        System.out.println(num + "대");
        Car.ShowNumberOfCar();
    }
}

