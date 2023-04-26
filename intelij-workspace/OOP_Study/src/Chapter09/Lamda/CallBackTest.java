package Chapter09.Lamda;
import javax.swing.*;
public class CallBackTest {
    public static void main(String[] args) {
        Timer t = new Timer(1000, event-> System.out.println("beep"));
        t.start();

        for(int i = 0; i<10; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
