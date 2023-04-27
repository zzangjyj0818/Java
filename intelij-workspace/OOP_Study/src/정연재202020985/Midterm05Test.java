package 정연재202020985;

public class Midterm05Test {
    public static void main(String[] args) {
        Midterm05 obj[] = new Midterm05[2];
        obj[0] = new dog();
        obj[1] = new cat();
        for(int i = 0; i<2; i++)
            obj[i].sound();
    }
}
