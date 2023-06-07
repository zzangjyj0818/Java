package Chapter08;

import javax.swing.*;
import java.awt.*;

public class FlowLayout extends JFrame {
    public FlowLayout(){
        JPanel panel = new JPanel();

        setSize(300,200);
        setTitle("FlowLayout");

//        panel.setLayout(new java.awt.FlowLayout());
        panel.setLayout(new GridLayout(4,0));

        for(int i = 1; i<=10; i++)
            panel.add(new Button("Button" + i));
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        FlowLayout f = new FlowLayout();
    }
}
