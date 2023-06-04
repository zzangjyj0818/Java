package Chapter10.MouseEvent;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class MyPanel3 extends JPanel{
    BufferedImage img = null;
    int img_x = 0, img_y = 0;

    public MyPanel3(){
        try{
            img = ImageIO.read(new File("car.gif"));
        }catch (IOException e){
            System.out.println("no image");
            System.exit(1);
        }

        addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                img_x = e.getX();
                img_y = e.getY();
                repaint();
            }
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, img_x, img_y, null);
    }
}
public class MoveCar extends JFrame{
    public MoveCar(){
        add(new MyPanel3());
        setSize(300,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MoveCar();
    }
}
