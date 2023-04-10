package Chapter06.AccessControl;

public class AcoountTest {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("Tom");
        obj.setBalance(100000);

        System.out.println(obj.getName() + " " + obj.getBalance());
    }
}
