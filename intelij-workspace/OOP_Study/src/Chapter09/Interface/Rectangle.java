package Chapter09.Interface;

public class Rectangle implements Comparable{
    private int width = 0;
    private int height = 0;

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println(this);
    }

    public int getArea(){
        return width*height;
    }

    @Override
    public int compareTo(Object other) {
        Rectangle otherRect = (Rectangle) other;
        if(this.getArea() < otherRect.getArea())
            return -1;
        else if(this.getArea() == otherRect.getArea())
            return 0;
        else
            return 1;
    }
}
