package Chapter08;

import javax.swing.*;
import java.awt.*;

public class Pizza extends JFrame {
    public Pizza(){
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Pizza");

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        JPanel panelA = new JPanel();
        panelA.setBackground(Color.CYAN);
        JPanel panelB = new JPanel();
        panelB.setBackground(Color.green);

        JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다.");
        panelA.add(label1);

        JButton button1 = new JButton("콤보피자");
        JButton button2 = new JButton("포테이토피자");
        JButton button3 = new JButton("불고기피자");
        panelB.add(button1);
        panelB.add(button2);
        panelB.add(button3);

        JLabel label2 = new JLabel("개수");
        JTextField field1 = new JTextField(10);
        panelB.add(label2);
        panelB.add(field1);

        panel.add(panelA);
        panel.add(panelB);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        Pizza p = new Pizza();
    }
}
