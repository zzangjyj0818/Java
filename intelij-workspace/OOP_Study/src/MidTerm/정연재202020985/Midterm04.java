package 정연재202020985;

public class Midterm04 {
    static int numberOfCar = 0;
    private String model;
    private String manufacture;

    public Midterm04(String model) {
        this.model = model;
        ++numberOfCar;
    }

    public Midterm04(String model, String manufacture) {
        this.model = model;
        this.manufacture = manufacture;
        ++numberOfCar;
    }

    public void setManufacture(String manufacture) {
        if(this.manufacture == null)
            this.manufacture = manufacture;
        else
            System.out.println("[error] Maker can't be changed after production");
    }

    public static int getNumberOfCars() {
        return numberOfCar;
    }

    public static void ShowNumberOfCar() {
        System.out.println("Cumulative production : " + numberOfCar);
    }
    public static void main(String[] args) {
        Midterm04 obj1 = new Midterm04("A3", "seoul");
        Midterm04 obj2 = new Midterm04("busan");
        Midterm04 obj3 = new Midterm04("A3", "china");

        int num = Midterm04.getNumberOfCars();
        System.out.println("Num of Car : " + num);
        obj3.setManufacture("seoul");
        Midterm04.ShowNumberOfCar();
    }
}
