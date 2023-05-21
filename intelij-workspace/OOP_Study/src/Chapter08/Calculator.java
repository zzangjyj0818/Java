package Chapter08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField display;
    private JButton[] buttons;
    private String[] labels = {"Backspace", " ", " ", "CE", "C", "7", "8", "9",
            "/", "sqrt", "4", "5", "6", "x", "%", "1", "2", "3",
            "-", "1/x", "0", "-/+", ".", "+", "=",};

    // 연산의 계산 결과를 가지고 있음
    private double result = 0;
    // 입력된 연산을 기억함
    private String operator = "=";

    // 숫자가 입력되기를 기다리는 상태이면 true, 숫자가 입력되는 도중이면 false
    private boolean startOfNumber = true;

    public Calculator() {
        display = new JTextField(35);
        panel = new JPanel();
        display.setText("0.0");

        panel.setLayout(new GridLayout(0, 5, 3, 3));
        buttons = new JButton[25];
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                buttons[index] = new JButton(labels[index]);
                if (j >= 3)
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

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.charAt(0) == 'C') {
            startOfNumber = true;
            result = 0;
            operator = "=";
            display.setText("0.0");
        } else if (command.equals("Backspace")) {     // 왼쪽부터 순차적으로 지워지도록 함
            setBackSpace(getBackSpace().substring(0, getBackSpace().length() - 1));
            if (getBackSpace().length() < 1) {  // 더 이상 지울 숫자가 없으면, 0으로 clear
                startOfNumber = true;
                result = 0;
                operator = "=";
                display.setText("0.0");
            }
        } else if (!command.equals("1/x") && !command.equals("sqrt") && command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals('.')) {
            if (startOfNumber == true)
                display.setText(command);
            else
                display.setText(display.getText() + command);
            startOfNumber = false;
        } else {
            if (startOfNumber) {
                if (command.equals("-")) {
                    display.setText(command);
                    startOfNumber = false;
                } else {
                    operator = command;
                }
            } else {
                double x = Double.parseDouble(display.getText());
                if (operator.equals("1/x")) {
                    display.setText(" " + 1 / x);
                } else if (operator.equals("sqrt")) {
                    display.setText(" " + Math.sqrt(x));
                } else if (operator.equals("-/+")) {
                        display.setText(" " + -x);
                } else
                    calculate(x);
                operator = command;
                startOfNumber = true;
            }
        }
    }

    private void calculate(double n) {
        if (operator.equals("+")) {
            result += n;
        } else if (operator.equals("-")) {
            result -= n;
        } else if (operator.equals("x")) {
            result *= n;
        } else if (operator.equals("/")) {
            result /= n;
        } else if (operator.equals("=")) {
            result = n;
        } else if (operator.equals("%")) {
            result %= n;
        }else if (operator.equals("-/+")) {
            result = -n;
        }
        display.setText(" " + result);
    }

    private void setBackSpace(String bs) {
        display.setText(bs);
    }

    private String getBackSpace() {
        return display.getText();
    }

    public static void main(String[] args) {
        Calculator s = new Calculator();
    }
}