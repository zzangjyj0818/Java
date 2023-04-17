//Bank를 상속받은 GoodBank
public class GoodBank extends Bank {
    //부모 클래스로부터 상속받은
    //getInterestRate를 오버라이딩하여 재정의함
    @Override
    double getInterestRate(){
        return 3;
    }
}
