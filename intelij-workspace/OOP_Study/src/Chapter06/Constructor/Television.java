package Chapter06.Constructor;

public class Television {
    private int channel;
    private int volume;
    private boolean onOff;

    public Television(int channel, int volume, boolean onOff) {
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }

    @Override
    public String toString() {
        return "Television{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", onOff=" + onOff +
                '}';
    }
}
