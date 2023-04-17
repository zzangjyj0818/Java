public class Box {
    //변수 선언 (width, height, length, volume)
    private int width;
    private int height;
    private int length;
    private int volume;

    //생성사 메서드
    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.volume = width*height*length;
    }
    //부피 값을 가져오는 메서드
    public int getVolume(){
        return volume;
    }

    //2개의 박스 객체를 비교하여 Boolean 타입으로 값을 반환하는 메서드
    boolean isSameBox(Box box){
        if(this.height == box.height && this.length == box.length && this.width == box.width)
            return true;
        else
            return false;
    }
}
