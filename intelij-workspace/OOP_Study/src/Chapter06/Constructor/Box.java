package Chapter06.Constructor;

public class Box {
    private int width;
    private int height;
    private int length;
    private int volume;

    public int getVolume(){
        return volume;
    }

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.volume = width*height*length;
    }
}
