package Study;

class Car {
    static int numberOfCar = 0;
    String model;
    String area;

    public Car(String model, String area) {
        this.model = model;
        this.area = area;
        System.out.println("자동차 1대 생산, 생산지 : " + area);
        numberOfCar++;
    }

    public Car(String area) {
        this.area = area;
        System.out.println("자동차 1대 생산, 생산지 : " + area);
        numberOfCar++;
    }

    public static int getNumberOfCars() {
        return numberOfCar;
    }

    public static void ShowNumberOfCar() {
        System.out.println("누적 생산량 : " + numberOfCar + "대");
    }
}
