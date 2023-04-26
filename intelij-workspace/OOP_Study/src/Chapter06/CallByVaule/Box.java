package Chapter06.CallByVaule;

public class Box {
    private int width, length, height;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    boolean isSameBox(Box obj){
        if((obj.height == height) && (obj.length == length) && (obj.width == width))
            return true;
        else
            return false;
    }
}
