package Chapter09.StaticMethod;
interface Employable{
    String getName();
    static boolean isEmpty(String str){
        if(str == null || str.trim().length() == 0)
            return true;
        else
            return false;
    }
}

class Employee implements Employable{
    private String name;

    public Employee(String name) {
        if(Employable.isEmpty(name) == true)
            throw new RuntimeException("Please Input the Name");
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
public class StaticMethodTest2 {
    public static void main(String[] args) {
        Employable employee1 = new Employee("홍길동");
//        Employable employee2 = new Employee("");
    }
}
