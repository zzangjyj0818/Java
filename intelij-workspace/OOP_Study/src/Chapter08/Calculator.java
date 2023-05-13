package Chapter08;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField display;
    private JButton[] buttons;
    private String[] labels = { "Backspace", " ", " ", "CE", "C",
                                "7", "8", "9", "/", "sqrt",
                                "4", "5", "6", "x", "%",
                                "1", "2", "3", "-", "1/x",
                                "0", "-/+", ".", "+", "=",};

    private double result = 0;
    private String operator = "=";
    private boolean startOfNumber = true;

    public Calculator() {
        display = new JTextField(35);
        panel = new JPanel();
        display.setText("0.0");
//        display.setEnabled(true);

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
                buttons[index].setBackground(Color.yellow);
                panel.add(buttons[index]);
                buttons[index].addActionListener(this);
                index++;
            }
        }
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        pack();
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(command.charAt(0) == 'C'){
            startOfNumber = true;
            result = 0;
            operator = "=";
            display.setText("0.0");
        } else if(!command.equals("1/x")  && command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")){
            if(startOfNumber == true)
                display.setText(command);
            else
                display.setText(display.getText() + command);
            startOfNumber = false;
        } else{
            if(startOfNumber){
                if(command.equals("-")){
                    display.setText(command);
                    startOfNumber = false;
                }else if(command.equals("1/x")){
                    display.setText(command);
                    startOfNumber = false;
                }
                else
                    operator = command;

            }else{
                double x = Double.parseDouble(display.getText());
                if(operator.equals("sqrt")){
                    display.setText(" " + Math.sqrt(x));
                }else{
                     calculate(x);
                }
                operator = command;
                startOfNumber = true;
            }
        }
    }

    private void calculate(double n){
        if(operator.equals("+"))
            result += n;
        else if(operator.equals("-"))
            result -= n;
        else if(operator.equals("x"))
            result *= n;
        else if(operator.equals("/"))
            result /=  n;
        else if(operator.equals("="))
            result = n;
        else if(operator.equals("%"))
            result %= n;
        display.setText(" " + result);
    }

    public static void main(String[] args) {
        Calculator s = new Calculator();
    }
}
