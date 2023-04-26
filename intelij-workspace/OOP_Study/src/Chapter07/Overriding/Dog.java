package Chapter07.Overriding;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("강아지가 먹고 있습니다.");
    }
}
