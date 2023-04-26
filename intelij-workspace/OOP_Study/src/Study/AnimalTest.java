package Study;

public class midterm05Test {
    public static void main(String[] args) {

        midterm05 obj[] = new midterm05[2];

        obj[0] = new dog();
        obj[1] = new cat();

        for (int i = 0; i < 2; i++) {
            obj[i].sound();
        }
    }
}