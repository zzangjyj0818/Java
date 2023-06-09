package 정연재202020985;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JPizza extends JFrame implements ActionListener{
    JButton button1, button2;
    JTextField field;
    int cnt = 0;
    public JPizza(String s){
        setSize(300, 150);
        setTitle("JPizza");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JLabel label = new JLabel("pcs");

        button1 = new JButton(s);
        button2 = new JButton("order");

        panel1.add(button1);
        panel3.add(button2);


        button1.addActionListener(this);
        button2.addActionListener(this);

        field = new JTextField(10);
        field.setText("0");

        panel2.add(label);
        panel2.add(field);

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            cnt++;
            field.setText("" + cnt);
        }
        if(e.getSource() == button2){
            dispose();
        }
    }
}
public class Finalterm03 extends JFrame implements ActionListener {
    JButton button1, button2, button3;
    public Finalterm03(){
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame5");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        panelA.setLayout(new FlowLayout());
        panelB.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setText("Welcome to java Pizza!. Select your Pizza!.");

        panelA.add(label);

        button1 = new JButton("Combo Pizza");
        button2 = new JButton("Potato Pizza");
        button3 = new JButton("Hawaiian Pizza");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        panelB.add(button1);
        panelB.add(button2);
        panelB.add(button3);

        panel.add(panelA);
        panel.add(panelB);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            new JPizza("Combo Pizza");
        }
        if(e.getSource() == button2){
            new JPizza("Potato Pizza");
        }
        if(e.getSource() == button3){
            new JPizza("Hawaiian Pizza");
        }
    }

    public static void main(String[] args) {
        Finalterm03 f = new Finalterm03();
    }
}
