//Animal을 상속받은 Cat class 선언
public class Cat extends Animal {
    //부모클래스로 부터 상속받은
    //sound()메서드를 오버라이딩 하여 재정의함
    @Override
    void sound() {
        System.out.println("야옹");
    }
}
