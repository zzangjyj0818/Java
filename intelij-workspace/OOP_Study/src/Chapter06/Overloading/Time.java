package Chapter06.Overloading;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        this(0,0,0);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
