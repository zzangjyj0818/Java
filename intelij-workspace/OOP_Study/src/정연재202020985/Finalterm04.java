package 정연재202020985;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finalterm04 extends JFrame implements ActionListener {

    // 접근지정자 (Private)로 선언
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

    // Calculator 생성자
    public Finalterm04() {
        display = new JTextField(35);
        panel = new JPanel();
        display.setText("");
        setTitle("Finalterm04");

        panel.setLayout(new GridLayout(0, 5, 3, 3));
        // 버튼 생성
        buttons = new JButton[25];
        int index = 0;
        // 반복문을 돌면서 버튼 글씨 색상과 배경 색상을 적용함.
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

    // actionPerformed 메서드
    // 입력과 연산결과를 처리함
    public void actionPerformed(ActionEvent e) {
        String Command = e.getActionCommand();

        if(!Command.equals("=")){
            display.setText(display.getText() + Command);
            int x = Integer.parseInt(display.getText());
            if (operator.equals("sqrt")) {
                display.setText(" " + Math.sqrt(x));
            } else
                calculate(x);
        }
        if(Command.equals("="))
            display.setText("" + result);
    }

    private void calculate(int n) {
        // 사칙 연산 및 나머지 연산을 처리
        if (operator.equals("+")) {
            result += n;
        } else if (operator.equals("-")) {
            result -= n;
        }
    }

    public static void main(String[] args) {
        Finalterm04 f = new Finalterm04();
    }
}
