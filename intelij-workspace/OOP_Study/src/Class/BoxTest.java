package Class;

public class BoxTest {
    public static void main(String[] args) {
        Box obj1 = new Box(10,20,50);
        Box obj2 = new Box(10,20,50);

        if(obj1.isSameBox(obj2))
            System.out.println("obj1 == obj2");
        else
            System.out.println("obj1 != obj2");
    }
}

