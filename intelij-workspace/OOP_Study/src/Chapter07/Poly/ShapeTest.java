package Chapter07.Poly;

class Shape{
    protected int x,y;
}
class Rectangle extends Shape{
    private int width, height;
}
class Triangle extends Shape{
    private int base, height;
}
class Circle extends Shape{
    private int radius;
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape s1, s2;
        s1 = new Shape();
        s2 = new Rectangle();
    }
}
