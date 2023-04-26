package Chapter07.Overriding;

class Shape{
    private int x,y;
    public Shape(int x, int y) {
        System.out.println("Shape()");
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape{
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        System.out.println("Rectangle()");
        this.width = width;
        this.height = height;
    }
    double calcArea(){
        return width*height;
    }
}
public class ColoredRectangle extends Rectangle{
    String color;

    public ColoredRectangle(int x, int y, int width, int height, String color) {
        super(x, y, width, height);
        System.out.println("ColoredRectangle()");
        this.color = color;
    }

    public static void main(String[] args) {
        ColoredRectangle obj = new ColoredRectangle(10, 10, 20, 20, "RED");
    }
}
