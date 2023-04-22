package Study;

public class midterm04Test {
    public static void main(String[] args) {

        midterm04 obj1 = new midterm04("A3", "seoul");
        midterm04 obj2 = new midterm04("busan");
        midterm04 obj3 = new midterm04("A3", "china");

        int num = midterm04.getNumberOfCars();
        System.out.println(num + "대");
        midterm04.ShowNumberOfCar();
    }
}

