package Chapter05;

public class TelevisionTest {
    public static void main(String[] args) {
//        참조 변수 선언 및 객체 생성 -> 참조 변수와 객체의 연결
        Television myTv = new Television();

        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;
        myTv.print();

        Television yourTv = new Television();

        yourTv.channel = 7;
        yourTv.volume = 9;
        yourTv.onOff = true;
        yourTv.print();

    }
}
