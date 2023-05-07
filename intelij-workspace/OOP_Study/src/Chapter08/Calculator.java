package Chapter08;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JPanel panel;
    private JTextField tField;
    private JButton[] buttons;
    // 계산기 버튼(글자)를 의미함
    private String[] labels = {
            "Backspace", "", "", "CE", "C",
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "x", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+", "=",
    };

    //생성자
    public Calculator(){
        //텍스트 필드의 칸수는 35
        tField = new JTextField(35);
        panel = new JPanel();
        //tField의 텍스트를 설정
        tField.setText("0.");
        tField.setEnabled(false);

        //패널의 배치 관지라를 그리드 레이아웃으로 지정한다.
        panel.setLayout(new GridLayout(0, 5, 3, 3));
        // 버튼의 갯수는 25개
        buttons = new JButton[25];

        int index = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                // 버튼 생성
                buttons[index] = new JButton(labels[index]);

                if(j >= 3){
                    //연산자들의 글씨를 빨강으로 설정
                    buttons[index].setForeground(Color.red);
                }
                else {
                    //피연산자들의 글씨를 파랑으로 설정
                    buttons[index].setForeground(Color.blue);
                }
                buttons[index].setBackground(Color.yellow);
                // 만들어진 버튼을 패널에 추가
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
        Calculator s = new Calculator();
    }
}
