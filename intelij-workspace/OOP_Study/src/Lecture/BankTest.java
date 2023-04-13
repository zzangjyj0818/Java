package Lecture;

public class BankTest {
    public static void main(String[] args) {
        BadBank b1 = new BadBank();
        NormalBank b2 = new NormalBank();
        GoodBank b3 = new GoodBank();

        System.out.println("BadBank : " + b1.getInterestRate());
        System.out.println("NormalBank : " + b2.getInterestRate());
        System.out.println("GoodBank : " + b3.getInterestRate());
    }
}
