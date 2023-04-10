package Chapter06.Constructor;

public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television(7,10,true);
        Television yourTv = new Television(11,20,true);

        System.out.println(myTv);
        System.out.println(yourTv);
    }
}
