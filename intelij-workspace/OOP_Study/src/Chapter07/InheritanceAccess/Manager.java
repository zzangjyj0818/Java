package Chapter07.InheritanceAccess;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    void test(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);
    }
}
