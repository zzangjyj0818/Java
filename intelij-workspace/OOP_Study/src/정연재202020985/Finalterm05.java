package 정연재202020985;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Finalterm05 extends JFrame implements KeyListener {
    private JButton[][] buttons;
    private int x = 6, y = 6;

    public Finalterm05() {
        setTitle("Finalterm05");
        setSize(600, 600);
        setLayout(new GridLayout(11, 11));

        buttons = new JButton[11][11];
        for (int i = 0; i < 11; i++) {
            for(int j = 0; j<11; j++){
                buttons[i][j].setText("");
                buttons[i][j].setBackground(Color.BLUE);
                buttons[i][j].addKeyListener(this);
                add(buttons[i][j]);
            }
        }
        buttons[x][y].setBackground(Color.red);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.requestFocus();
        setFocusable(true);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        x = getX();
        int keycode = e.getKeyChar();
        switch (keycode) {
            case 'w':
                x -= 11;
                break;
            case 's':
                x += 11;
                break;
            case 'a':
                x -= 1;
                break;
            case 'd':
                x += 1;
                break;
        }
        buttons[x][y].setBackground(Color.red);
    }

    public void keyPressed(KeyEvent arg0) {
    }

    public void keyReleased(KeyEvent arg0) {
    }

    public static void main(String[] args) {
        Finalterm05 n = new Finalterm05();
    }
}
