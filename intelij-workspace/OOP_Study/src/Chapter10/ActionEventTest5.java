package Chapter10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame5 extends JFrame{
    private JButton button;
    private JLabel label;

    public MyFrame5() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Example Event");

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼이 눌러지지 않았습니다");
        button.addActionListener(e -> {
            label.setText("마침내 버튼이 눌러졌습니다.");
        });

        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}
public class ActionEventTest5 {
    public static void main(String[] args) {
        MyFrame5 t = new MyFrame5();
    }
}
