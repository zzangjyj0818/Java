public class Box {
    private int width;
    private int height;
    private int length;
    private int volume;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.volume = width*height*length;
    }
    public int getVolume(){
        return volume;
    }

    boolean isSameBox(Box box){
        if(this.height == box.height && this.length == box.length && this.width == box.width)
            return true;
        else
            return false;
    }
}
