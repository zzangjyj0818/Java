package Chapter07.Overriding;

class Bank{
    double getInterestRate(){
        return 0.0;
    }
}
class BadBank extends Bank{
    @Override
    double getInterestRate() {
        return 10.0;
    }
}
class NormalBank extends Bank{
    @Override
    double getInterestRate() {
        return 5.0;
    }
}
class GoodBank extends Bank{
    @Override
    double getInterestRate() {
        return 3.0;
    }
}
public class BankTest {
    public static void main(String[] args) {
        BadBank b1 = new BadBank();
        NormalBank b2 = new NormalBank();
        GoodBank b3 = new GoodBank();
        System.out.println(b1.getInterestRate());
        System.out.println(b2.getInterestRate());
        System.out.println(b3.getInterestRate());
    }
}
