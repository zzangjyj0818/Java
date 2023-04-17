public class Employee {
    //변수 선언
    public String name;
    String address;
    protected int salary;
    private int rrn;

    //Employee 생성자 메서드
    public Employee(String name, String address, int salary, int rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    //오버라이딩을 사용하여 toString을 재정의함
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", rrn=" + rrn +
                '}';
    }
}
