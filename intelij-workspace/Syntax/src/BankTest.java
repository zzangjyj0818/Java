public class BankTest {
    public static void main(String[] args) {
        //객체 생성
        BadBank b1 = new BadBank();
        NormalBank b2 = new NormalBank();
        GoodBank b3 = new GoodBank();

        //각 객체(은행)의 이자율에 관한 메서드를 호출하여
        //각 은행에 대한 이자율을 출력함
        System.out.println("BadBank : " + b1.getInterestRate());
        System.out.println("NormalBank : " + b2.getInterestRate());
        System.out.println("GoodBank : " + b3.getInterestRate());
    }
}
