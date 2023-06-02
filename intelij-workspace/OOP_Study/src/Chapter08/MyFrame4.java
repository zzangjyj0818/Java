package Chapter08;

import javax.swing.*;
import java.awt.*;

public class MyFrame4 extends JFrame {
    public MyFrame4() {
        Toolkit kit = Toolkit.getDefaultToolkit(); //현재 크기의 화면을 얻음
        Dimension screenSize = kit.getScreenSize();

        setSize(300, 200);

        // 프레임의 위치를 현재 화면의 중앙으로 함
        setLocation(screenSize.width / 2, screenSize.height / 2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrmae4");
        Image img = kit.getImage("icon.gif");
        setIconImage(img);

        setLayout(new FlowLayout());
        JButton button = new JButton("Button");
        this.add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame4 f = new MyFrame4();
    }
}
