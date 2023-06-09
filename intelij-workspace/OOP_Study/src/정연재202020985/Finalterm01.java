package 정연재202020985;

import Chapter08.Mylab;

import javax.swing.*;
import java.awt.*;

public class Finalterm01 extends JFrame {
    public Finalterm01(){
        setLayout(new GridLayout());
        JPanel panel = new JPanel();
        add(panel);

        JLabel label1 = new JLabel("Temperature F");
        JLabel label2 = new JLabel("Temperature C");

        JTextField field1 = new JTextField(15);
        JTextField field2 = new JTextField(15);

        JButton button = new JButton("변환");

        panel.add(label1);
        panel.add(field1);

        panel.add(label2);
        panel.add(field2);

        panel.add(button);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Finalterm01");
        setVisible(true);
    }

    public static void main(String[] args) {
        Finalterm01 f = new Finalterm01();
    }
}
