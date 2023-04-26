package Chapter09.Interface;

public class AutoCar implements OperateCar{
    @Override
    public void start() {
        System.out.println("Start the Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Car");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("Change the speed => " + speed);
    }

    @Override
    public void turn(int degree) {
        System.out.println("Change the Degree => " + degree);
    }
}
