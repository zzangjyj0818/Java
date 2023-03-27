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
