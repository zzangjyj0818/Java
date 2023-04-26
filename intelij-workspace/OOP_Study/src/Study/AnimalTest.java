package Study;

public class AnimalTest {
    public static void main(String[] args) {

        Animal obj[] = new Animal[2];

        obj[0] = new dog();
        obj[1] = new cat();

        for (int i = 0; i < 2; i++) {
            obj[i].sound();
        }
    }
}