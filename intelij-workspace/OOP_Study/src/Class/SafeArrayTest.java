package Class;

public class SafeArrayTest {
    public static void main(String[] args) {
        SafeArray array = new SafeArray(3);

        for(int i = 0; i< (array.length+1); i++){
            array.setA(i, i*10);
//            System.out.println(array.getA(i));
        }
    }
}
