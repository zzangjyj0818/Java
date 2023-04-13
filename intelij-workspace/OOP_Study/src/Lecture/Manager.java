package Lecture;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    public void test(){
        System.out.println("name = " + this.name);
        System.out.println("address = " + this.address);
        System.out.println("salary = " + this.salary);
    }

}
