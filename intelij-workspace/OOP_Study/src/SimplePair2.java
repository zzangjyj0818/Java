public class SimplePair2<K> {
    public String first;
    public String second;

    public SimplePair2(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public static void main(String[] args) {

        SimplePair2<String> pair = new SimplePair2<String>("apple", "tomato");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
