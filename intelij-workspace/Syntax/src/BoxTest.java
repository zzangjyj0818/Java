public class BoxTest {
    public static void main(String[] args) {
        //객체 a,b 생성
        Box a = new Box(20,20,30);
        Box b = new Box(20,20,40);

        //조건문을 사용하여
        //두 박스가 같은지를 확인
        if(a.isSameBox(b) == true){
            System.out.println("a == b");
        }else{
            System.out.println("a!=b");
        }
    }
}
