package Chapter08;

import javax.swing.*;
import java.awt.*;

public class RandomNumber extends JFrame {
    JPanel p = new JPanel();
    JLabel[] labels = new JLabel[30];

    public RandomNumber(){
        p.setLayout(null);
        p.setBackground(Color.YELLOW);
        for(int i = 0; i<30; i++){
            labels[i]= new JLabel(""+i);
            int x = (int)(500*Math.random());
            int y = (int)(500*Math.random());
            labels[i].setForeground(Color.MAGENTA);
            labels[i].setLocation(x,y);
            labels[i].setSize(20,30);
            p.add(labels[i]);
        }
        setSize(500,300);
        add(p);
        setVisible(true);
    }

    public static void main(String[] args) {
        RandomNumber f = new RandomNumber();
    }
}
