package Chapter07.Poly;

class Animal{
    void sound(){
        System.out.println("Animal Class Sound()");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("wal wal");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("meow meow");
    }
}
public class DynamicCallTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal obj;
        obj = animal;
        obj.sound();

        obj = dog;
        obj.sound();

        obj = cat;
        obj.sound();
    }
}
