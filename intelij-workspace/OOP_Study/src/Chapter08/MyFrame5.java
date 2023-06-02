package Chapter08;

import javax.swing.*;
import java.awt.*;

public class MyFrame5 extends JFrame {
    public MyFrame5(){
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame5");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        JLabel label = new JLabel();
        label.setText("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");

        panel.setBackground(Color.BLUE);
        panelA.setBackground(Color.CYAN);
        panelB.setBackground(Color.GREEN);

        panelA.add(label);

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
        MyFrame5 f = new MyFrame5();
    }
}
