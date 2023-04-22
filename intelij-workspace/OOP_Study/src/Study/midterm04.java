package Study;

class midterm04 {
    static int numberOfCar = 0;
    String model;
    String area;

    public midterm04(String model, String area) {
        this.model = model;
        this.area = area;
        System.out.println("자동차 1대 생산, 생산지 : " + area);
        numberOfCar++;
    }

    public midterm04(String area) {
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
