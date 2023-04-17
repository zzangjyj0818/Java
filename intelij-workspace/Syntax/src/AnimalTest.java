public class AnimalTest {
    public static void main(String[] args) {
        //객체 선언
        Animal s1, s2;
        s1 = new Dog();
        s2 = new Cat();

        //메서드를 호출하여 각 객체의 울음소리 출력
        System.out.println("Animal 클래스의 sound()");
        s1.sound();
        s2.sound();
    }
}
