package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame6 extends JFrame{
    private JButton button1;
    private JButton button2;
    private JPanel panel;
    MyListner listner = new MyListner();

    public MyFrame6(){
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");

        panel = new JPanel();
        button1 = new JButton("노란색");
        button2 = new JButton("핑크색");
        panel.add(button1);
        panel.add(button2);
        button1.addActionListener(listner);
        button2.addActionListener(listner);

        this.add(panel);
        this.setVisible(true);
    }

    private class MyListner implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == button1){
                panel.setBackground(Color.YELLOW);
            }
            else if(e.getSource() == button2){
                panel.setBackground(Color.pink);
            }
        }
    }
}
public class ChangeBackground {
    public static void main(String[] args) {
        MyFrame6 t = new MyFrame6();
    }
}
