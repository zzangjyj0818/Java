package Chapter08;

import javax.swing.*;

public class Mylab extends JFrame {
    public Mylab(){
        JPanel panel = new JPanel();
        add(panel);

        JLabel label1 = new JLabel("화씨 온도");
        JLabel label2 = new JLabel("섭씨 온도");

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
        setTitle("온도 변환기");
        setVisible(true);
    }

    public static void main(String[] args) {
        Mylab f = new Mylab();
    }
}
