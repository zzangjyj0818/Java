package 정연재202020985;

public class Midterm07 implements Animal{
    @Override
    public String fly() {
        return "able to fly, ";
    }

    @Override
    public String sing() {
        return "able to sing, ";
    }

    public String walk(){
        return "able to walk, ";
    }


    private String name;
    public Midterm07(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " is " + walk() + fly() + sing();
    }

    public static void main(String[] args) {
        Midterm07 obj = new Midterm07("Bird");
        System.out.println(obj);
    }
}
