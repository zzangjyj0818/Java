package Class;

public class Box {
    int width, length, hegiht, volume;

    public Box(int width, int length, int hegiht) {
        this.width = width;
        this.length = length;
        this.hegiht = hegiht;
        this.volume = width*length*hegiht;
    }
    Box whosLargest(Box box1, Box box2){
        if(box1.volume > box2.volume)
            return box1;
        else
            return box2;
    }

    Boolean isSameBox(Box box){
        if((this.hegiht == box.hegiht) && (this.length == box.length) && (this.width == box.width))
            return true;
        else
            return false;
    }
}
