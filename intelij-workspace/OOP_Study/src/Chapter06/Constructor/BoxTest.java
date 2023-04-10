package Chapter06.Constructor;

public class BoxTest {
    public static void main(String[] args) {
        Box b = new Box(20,20,30);

        System.out.printf("Volume : %d\n", b.getVolume());
    }
}
