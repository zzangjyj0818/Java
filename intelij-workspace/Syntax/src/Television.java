public class Television implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off");
    }
}
