package Chapter08;

import javax.swing.*;
import java.awt.*;

public class MyFrame6 extends JFrame {
    public MyFrame6(){
        setTitle("GirdLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(0,3));

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("B4"));
        add(new JButton("Long Button5"));

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame6 f = new MyFrame6();
    }
}
