package Chapter02;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2012;
        boolean isLeapYear;

        isLeapYear = (year % 4 == 0);
        System.out.println(isLeapYear);
    }
}
