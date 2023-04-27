package 정연재202020985;

public class Midterm03 {
    public int sum(int a, int b){
        System.out.printf("Result %d is the sum of %d,%d\n", a+b, a,b);
        return a+b;
    }
    public int sum(int a, int b, int c){
        System.out.printf("Result %d is the sum of %d,%d,%d\n", a+b+c, a,b,c);
        return (a+b+c);
    }
    public static void main(String[] args) {
        Midterm03 obj = new Midterm03();
        obj.sum(10,20,30);
        obj.sum(10,20);
    }
}
