public class ClassExample {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        // password는 private로 설정해놓았기 떄문에
        // 오류 발생
        // private는 동일 클래스에서만 수정 가능
        // private는 값도 넣지 못하고, 조회도 하지 못함.

        bankAccount.setPassword(1234567);
        System.out.println(bankAccount.getPassword());
    }
}


// 상속
// 재활용성이 높아짐

// 다중 상속은 안됨!!
// 다중 상속 시 중복 메서드가 있을 때, 어떤 부모클래스에서 가져와야 할 지 컴파일러가 모름
// => 다이아몬드 상속 문제가 발생하기때문에 안된다라고 말하면 좋음.

// 인터페이스는 다중 상속이 가능함
// 메서드에 내용이 없기 떄문에 인터페이스만 가능....


// 파이썬은 다중 상속이 됨.... (다이아몬드 상속)
// 파이썬은 다중 상속 시 왼쪽 부모 클래스를 따라감
