package Class;

public class Television {
    private int channel;
    private int volume;
    private boolean onOff;


    public Television(int channel, int volume, boolean onOff) {
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }

    void print(){
        System.out.println("채널은 " + channel +"이고 볼륨은 " + volume + "입니다.");
    }
}
