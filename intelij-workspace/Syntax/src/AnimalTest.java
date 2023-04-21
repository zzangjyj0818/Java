public class AnimalTest {
    public static void main(String[] args) {
        Animal s1, s2;
        s1 = new Dog();
        s2 = new Cat();

        System.out.println("Animal 클래스의 sound()");
        s1.sound();
        s2.sound();
    }
}
