package Chapter08;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
    private JPanel panel;
    private JTextField tField;
    private JButton[] buttons;
    private String[] labels = {
            "Backspace", "", "", "CE", "C",
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "x", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+", "=",
    };

    public Calculator(){
        tField = new JTextField(35);
        panel = new JPanel();
        tField.setText("0.");
        tField.setEnabled(false);

        panel.setLayout(new GridLayout(0,5,3,3));
        buttons = new JButton[25];
        int index = 0;

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                buttons[index] = new JButton(labels[index]);
                if(j >= 3)
                    buttons[index].setForeground(Color.red);
                else
                    buttons[index].setForeground(Color.blue);
                buttons[index].setBackground(Color.YELLOW);
                panel.add(buttons[index]);
                index++;
            }
        }
        add(tField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        Calculator f = new Calculator();
    }
}
