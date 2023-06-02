package Chapter08;

import javax.swing.*;
import java.awt.*;

public class MyFrame3 extends JFrame{
    public MyFrame3() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        setLayout(new FlowLayout());
        //FlowLayOut - 믈이 흐르듯이 배치하는 방식
        JButton button = new JButton("버튼");
        this.add(button);
        setVisible(true);
    }
}
