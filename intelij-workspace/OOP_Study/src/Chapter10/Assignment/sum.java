package Chapter10.Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sum extends JFrame implements ActionListener {
    private JLabel label1, label2, label3;
    private JTextField field1, field2, field3;
    private JButton button;
    private JPanel panel1, panel2, panel3, panel4;

    public sum(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        label1 = new JLabel("첫번째 정수");
        field1 = new JTextField(10);
        panel1.setLayout(new FlowLayout());
        panel1.add(label1);
        panel1.add(field1);

        label2 = new JLabel("두번째 정수");
        field2 = new JTextField(10);
        panel2.setLayout(new FlowLayout());
        panel2.add(label2);
        panel2.add(field2);

        label3 = new JLabel("연산의 결과");
        field3 = new JTextField(10);
        panel3.setLayout(new FlowLayout());
        panel3.add(label3);
        panel3.add(field3);

        panel4 = new JPanel(new FlowLayout());
        button = new JButton("연산하기");
        button.addActionListener(this);
        panel4.add(button);

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);


        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            int a = Integer.parseInt(field1.getText());
            int b = Integer.parseInt(field2.getText());
            field3.setText("" + (a+b));
        }
    }

    public static void main(String[] args) {
        sum s = new sum();
    }
}
