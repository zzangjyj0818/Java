
//Employee를 Manager에 상속한 클래스
public class Manager extends Employee {
    private int bonus;

    //Manager 생성자 메서드
    public Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    //객체의 정보를 출력하는 메서드
    public void test(){
        System.out.println("name = " + this.name);
        System.out.println("address = " + this.address);
        System.out.println("salary = " + this.salary);
    }

}
