import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try{
            System.out.println(readString());
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static String readString() throws IOException{
        byte[] buf = new byte[100];
        System.out.print("Input the String : ");
        System.in.read(buf);
        return new String(buf);
    }
}
