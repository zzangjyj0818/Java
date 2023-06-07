package Chapter10.Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

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
    public Calculator() {
        display = new JTextField(35);
        panel = new JPanel();
        display.setText("0.0");

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
        // 문자열 command
        String command = e.getActionCommand();

        // 만약 command의 첫 글자가 'C'인 경우
        // 모든 것을 초기화 함
        if (command.charAt(0) == 'C') {
            startOfNumber = true;
            result = 0;
            operator = "=";
            display.setText("0.0");
        } else if (command.equals("Backspace")) {     // 왼쪽부터 순차적으로 지워지도록 함
            setBackSpace(getBackSpace().substring(0, getBackSpace().length() - 1));
            if (getBackSpace().length() < 1) {  // 더 이상 지울 숫자가 없으면, 0으로 clear || command.charAt(0) == 'C'와 유사한 로직
                startOfNumber = true;
                result = 0;
                operator = "=";
                display.setText("0.0");
            } // 만약 command가 숫자일 경우
        } else if (!command.equals("1/x") && !command.equals("sqrt") && command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals('.')) {
            if (startOfNumber == true) //display.setText로 텍스트를 보여줌
                display.setText(command);
            else // 기존에 있던 텍스트를 가져와 +를 사용하여 추가적으로 문자열을 붙여줌
                display.setText(display.getText() + command);
            startOfNumber = false;
        } else {
            // 연산자를 가져옴.
            if (startOfNumber) {
                if (command.equals("-")) {
                    display.setText(command);
                    startOfNumber = false;
                } else {
                    operator = command;
                }
            } else { // 연산자 처리 과정
                double x = Double.parseDouble(display.getText()); // 입력된 스트링 문자열을 화면으로부터 가져와 실수형으로 변환
                if (operator.equals("1/x")) { //만약 연산자가 1/x인 경우, 1/x를 setText를 통해 출력
                    display.setText(" " + 1 / x);
                } else if (operator.equals("sqrt")) { // 만약 연산자가 sqrt인 경우, sqrt(number)의 결과를 setText를 통해 출력함
                    display.setText(" " + Math.sqrt(x));
                } else if (operator.equals("-/+")) { //만약 -/+ 연산자인 경우, 부호를 바꾸어서 setText를 통해 결과값을 출력함
                    display.setText(" " + -x);
                } else // 나머지 경우에는 calculate(x) 메서드에서 계산되어 출력됨
                    calculate(x);
                operator = command;
                startOfNumber = true;
            }
        }
    }

    private void calculate(double n) {
        // 사칙 연산 및 나머지 연산을 처리
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
        }
        display.setText(" " + result);
    }


    private void setBackSpace(String bs) {
        display.setText(bs);
    }

    //화면으로부터 텍스트를 가져오는 메서드, 가져온 값을 반환함
    private String getBackSpace() {
        return display.getText();
    }

    public static void main(String[] args) {
        Calculator s = new Calculator();
    }
}
