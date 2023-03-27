
//BankAccount - 부모 클래스
//SavingAccount - 자식 클래스
// 자식 클래스는 부모 클래스로부터 모든 것을 상속받는다
// 자식클래스 extends 부모 클래스
// 단일 상속 언어 - 자바

public class SavingAccount extends BankAccount implements Withdrawable{
    boolean isOverdraft;
    void transfer(){};

    // 인터페이스로 가져온 메서드는
    // 접근 제어자를 사용해서 써야함
    public void withdraw(){
        System.out.println("Withdraw");
    };
}
