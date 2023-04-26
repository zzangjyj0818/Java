package Chapter06.CallByVaule;

public class BoxTest {
    public static void main(String[] args) {
        Box obj1 = new Box(10,20,50);
        Box obj2 = new Box(10,20,50);

        System.out.println(obj1.isSameBox(obj2));
    }
}
