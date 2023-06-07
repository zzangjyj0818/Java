package Chapter10.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperScissor extends JFrame implements ActionListener {
    static final int ROCK = 0;
    static final int PAPER = 1;
    static final int SCISSOR = 2;

    private JPanel panel;
    private JTextField output;
    private JTextField information;
    private JButton rock;
    private JButton paper;
    private JButton scissor;

    public RockPaperScissor(){
        setTitle("가위, 바위, 보");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(0,3));

        information = new JTextField("아래의 버튼 중에서 하나를 클릭하시오!");
        output = new JTextField(20);

        rock = new JButton("ROCK");
        paper = new JButton("PAPER");
        scissor = new JButton("SCISSOR");
        rock.addActionListener(this);
        paper.addActionListener(this);
        scissor.addActionListener(this);

        panel.add(rock);
        panel.add(scissor);
        panel.add(paper);

        add(information, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(output, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        RockPaperScissor gui = new RockPaperScissor();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Random random = new Random();
        int computer = random.nextInt(3);
        if(e.getSource() == rock){
            if(computer == SCISSOR)
                output.setText("User Victory");
            else if(computer == ROCK){
                output.setText("Draw");
            }
            else{
                output.setText("User Lose");
            }
        }
        else if(e.getSource() == scissor){
            if(computer == SCISSOR)
                output.setText("Draw");
            else if(computer == ROCK){
                output.setText("User Victory");
            }
            else{
                output.setText("User Lose");
            }
        }
        else if(e.getSource() == paper){
            if(computer == SCISSOR)
                output.setText("User Lose");
            else if(computer == ROCK){
                output.setText("User Victory");
            }
            else{
                output.setText("Draw");
            }
        }
    }
}
