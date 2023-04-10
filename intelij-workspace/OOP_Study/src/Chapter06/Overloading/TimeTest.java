package Chapter06.Overloading;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println(time1.toString());
        Time time2 = new Time(13,27,6);
        System.out.println(time2.toString());
    }
}
