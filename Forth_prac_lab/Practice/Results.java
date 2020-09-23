package Forth_prac_lab.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Results {
    public static void main(String[] args) {
        new Football();
    }
}

class Football extends JFrame{

    JPanel []jPanels=new JPanel[3];
    JLabel result=new JLabel("Result: 0 X 0");
    JLabel last_Score =new JLabel("Last Score: N/A");
    Label winner=new Label("Winner: DRAW");
    JButton Milan=new JButton("AC Milan");
    JButton Real=new JButton("Real Madrid");
    int milan_score=0;
    int real_score=0;

    public Football(){
        super("AC Milan VS Real Madrid");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,200);

        setLayout(new GridLayout());
        for (int i = 0; i < jPanels.length; i++) {
            jPanels[i]=new JPanel();
            add(jPanels[i]);
        }
        jPanels[0].add(Milan);
        jPanels[2].add(Real);
        jPanels[1].add(result, BorderLayout.NORTH);
        jPanels[1].add(last_Score,BorderLayout.CENTER);
        jPanels[1].add(winner,BorderLayout.SOUTH);
        Milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                milan_score+=1;
                last_Score.setText("Last Score: AC Milan");
                result.setText("Result: "+milan_score+" X "+real_score);
                if(real_score==milan_score) winner.setText("Result: DRAW");
                else if(real_score>milan_score) winner.setText("Result: Real Madrid");
                else winner.setText("Result: AC Milan WIN");
            }
        });
        Real.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                real_score+=1;
                last_Score.setText("Last Score: Real Madrid");
                result.setText("Result: "+milan_score+" X "+real_score);
                if(real_score==milan_score) winner.setText("Result: DRAW");
                else if(real_score>milan_score) winner.setText("Result: Real Madrid WIN");
                else winner.setText("Result: AC Milan WIN");
            }
        });

        setVisible(true);
    }
}
