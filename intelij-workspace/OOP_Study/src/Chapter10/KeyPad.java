package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyPad extends JFrame implements ActionListener {
    private JTextField txt;
    private JPanel panel;

    public KeyPad(){
        txt = new JTextField(20);
        add(txt, BorderLayout.NORTH);
        panel = new JPanel();
        panel.setLayout(new GridLayout(0,3,2,2));
        add(panel, BorderLayout.CENTER);

        for(int i = 0; i<=9; i++){
            JButton btn = new JButton(""+i);
            btn.addActionListener(this);
            btn.setPreferredSize(new Dimension(100,100));
            panel.add(btn);
        }
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String actionCommand = e.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
    }

    public static void main(String[] args) {
        new KeyPad();
    }
}
