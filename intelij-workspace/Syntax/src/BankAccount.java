// 인터페이스는 마지막에 implements를 붙이고 인터페이스파일 이름을 작성
public class BankAccount {

    // 멤버변수 (사물)


    // 접근 제어자....?
    // => 타입 앞에 사용이됨
    // 보안과 안정성 문제로 인해 접근 제어자를 사용

    // private

    private int bankCode;
    private int accountNum;
    private String owner;
    private int balance;
    private boolean isDormant;
    private int password;

    // 메소드 (기능)
    // 메소드는 대부분 public
    public void inquiry(){}
    public void deposit(){}
    public void heldIsDormant(){}
    public void changePassword(int password){
        this.password = password;
    }


    // 생성자
    // 클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치해야함!
    // new 연산자와 함께 사용해야함!

    //파라미터를 받지 않는 생성자 함바
    BankAccount() {}

    //파라미터를 받는 생성자 함수
    BankAccount(
            int bankCode,
            int accountNum,
            String owner,
            int balance,
            int password,
            boolean isDormant
    ){
        this.bankCode = bankCode;
        this.accountNum = accountNum;
        this.owner = owner;
        this.balance = balance;
        this.password =password;
        this.isDormant = isDormant;
    }


    // getter 와 setter
    // 대부분 클래스의 맨아래에 작성함
    // Generate -> getter & setter -> 생성


    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    // 인터페이스
}
