package Chapter06.StaticMember;

public class MyClass {
    static int x;
    int y;

    static{
        x = 10;
        System.out.println("Call the Static Block!");
    }
}
