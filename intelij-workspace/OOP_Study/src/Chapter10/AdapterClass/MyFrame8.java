package Chapter10.AdapterClass;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class MyPanel5 extends JPanel {
    BufferedImage img = null;
    int img_x = 0, img_y = 0;

    public MyPanel5() {
        try {
            img = ImageIO.read(new File("car.gif"));
        } catch (IOException e) {
            System.out.println("no image");
            System.exit(1);
        }
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                img_x = e.getX();
                img_y = e.getY();
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, img_x, img_y, null);
    }
}


public class MyFrame8 extends JFrame{
    public static void main(String[] args) {

    }
}
