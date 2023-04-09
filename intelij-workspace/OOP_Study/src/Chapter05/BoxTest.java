package Chapter05;

public class BoxTest {
    public static void main(String[] args) {
        Box b;
        b = new Box();

        b.width = 20;
        b.height = 20;
        b.length = 30;
        System.out.printf("%d %d %d", b.width, b.height, b.length);
    }
}
