public class BoxTest {
    public static void main(String[] args) {
        Box a = new Box(20,20,30);
        Box b = new Box(20,20,40);

        if(a.isSameBox(b) == true){
            System.out.println("a == b");
        }else{
            System.out.println("a!=b");
        }
    }
}
