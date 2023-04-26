package Chapter07.Inheritance;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    void draw(){
        System.out.println("(" + this.getX() + " " + this.getY() + ") " + width + " " + height);
    }
}
