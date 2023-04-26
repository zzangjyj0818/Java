package Chapter09.Interface;

public class Television implements RemoteControl{
    boolean onOff = false;

    @Override
    public void turnOn() {
        onOff = true;
    }

    @Override
    public void turnOff() {
        onOff = false;
    }
}
