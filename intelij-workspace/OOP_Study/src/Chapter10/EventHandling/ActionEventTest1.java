package Chapter10.EventHandling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListner implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton) e.getSource();
        button.setText("마침내 버튼이 눌러졌습니다.");
    }
}

class MyFrame1 extends JFrame{
    private JButton button;
    private JLabel label;

    public MyFrame1(){
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Example Event");

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼이 눌러지지 않았습니다");
        button.addActionListener(new MyListner());

        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}

public class ActionEventTest1 {
    public static void main(String[] args) {
        MyFrame1 t = new MyFrame1();
    }
}
