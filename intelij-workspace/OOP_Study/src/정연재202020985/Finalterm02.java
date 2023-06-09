package 정연재202020985;

import javax.swing.*;
import java.awt.*;

public class Finalterm02 extends JFrame{
    public Finalterm02(){
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Finalterm02");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        panelB.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setText("Welcome to java Pizza!. Select your Pizza!.");

        panelA.add(label);

        JButton button1 = new JButton("Combo Pizza");
        JButton button2 = new JButton("Potato Pizza");
        JButton button3 = new JButton("Hawaiian Pizza");


        panelB.add(button1);
        panelB.add(button2);
        panelB.add(button3);

        panel.add(panelA);
        panel.add(panelB);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        Finalterm02 f = new Finalterm02();
    }
}
