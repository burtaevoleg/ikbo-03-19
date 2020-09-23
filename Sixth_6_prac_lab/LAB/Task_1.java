package Sixth_6_prac_lab.LAB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        new Game();
    }
}

class Game extends JFrame{

    JButton jButton=new JButton("Угадать");
    int attempt=0;
    JTextField jTextField=new JTextField(10);
    String true_number;

    public Game(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        setLayout(new FlowLayout());

        true_number= String.valueOf(new Random().nextInt(21));
        add(jButton);
        add(jTextField);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String result= jTextField.getText();
                if(result.equals(true_number)){
                    JOptionPane.showMessageDialog(null,"Вы угадали числа");
                    dispose();
                }
                else {
                    attempt++;
                    if(attempt==3){
                        JOptionPane.showMessageDialog(null,"Вы не угадали. Все попытки закончились. " +
                                "\nПравильное число было: " +true_number);
                        dispose();
                    }
                    else{
                        if(Integer.parseInt(true_number)>Integer.parseInt(result)){
                            JOptionPane.showMessageDialog(null,"Ваше число меньше");
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Ваше число больше");
                        }
                        jTextField.setText("");
                    }
                }
            }
        });
        setVisible(true);

    }


}
