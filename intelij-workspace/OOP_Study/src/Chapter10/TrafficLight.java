package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyPanel2 extends JPanel implements ActionListener {
    boolean flag = false;
    private int light_number = 0;

    public MyPanel2() {
        setLayout(new BorderLayout());
        JButton b = new JButton("traffic light turn on");
        b.addActionListener(this);
        add(b, BorderLayout.SOUTH);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawOval(100, 100, 100, 100);
        g.drawOval(100, 200, 100, 100);
        g.drawOval(100, 300, 100, 100);
        if (light_number == 0) {
            g.setColor(Color.red);
            g.fillOval(100, 100, 100, 100);
        } else if (light_number == 1){
            g.setColor(Color.green);
            g.fillOval(100, 200,100,100);
        }else{
            g.setColor(Color.YELLOW);
            g.fillOval(100, 300,100,100);
        }
    }

    public void actionPerformed(ActionEvent arg0){
        if(++light_number > 3)
            light_number = 0;
        repaint();
    }
}

public class TrafficLight extends JFrame{
    public TrafficLight(){
        add(new MyPanel2());
        setSize(300, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}
