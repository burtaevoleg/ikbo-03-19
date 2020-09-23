package Sixth_6_prac_lab.LAB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task_3 {
    public static void main(String[] args) {
        new Menu();
    }
}

class Menu extends JFrame{
    JTextArea jTextArea;
    public Menu(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        jTextArea=new JTextArea();
        jTextArea.setFont(new Font("Times New Roman",Font.PLAIN,16));
        add(jTextArea,BorderLayout.CENTER);
        JMenuBar jMenuBar=new JMenuBar();
        jMenuBar.add(createColor());
        jMenuBar.add(createFont());
        setJMenuBar(jMenuBar);
        setVisible(true);
        setSize(500,500);
    }

    private JMenu createColor(){
        JMenu menu=new JMenu("Цвет");
        JRadioButton blue=new JRadioButton("Синий");
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextArea.setForeground(Color.BLUE);
            }
        });
        JRadioButton red=new JRadioButton("Красный");
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextArea.setForeground(Color.RED);
            }
        });
        JRadioButton black=new JRadioButton("Черный",true);
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextArea.setForeground(Color.BLACK);
            }
        });
        ButtonGroup bg=new ButtonGroup();
        bg.add(black);
        bg.add(red);
        bg.add(blue);
        menu.add(black);
        menu.add(red);
        menu.add(blue);
        return menu;
    }
    private JMenu createFont(){
        JMenu menu=new JMenu("Шрифт");
        JRadioButton times_new_roman=new JRadioButton("Times New Roman",true);
        times_new_roman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextArea.setFont(new Font("Times New Roman",Font.PLAIN,16));
            }
        });
        JRadioButton ms_sans_serif=new JRadioButton("MS Sans Serif");
        ms_sans_serif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextArea.setFont(new Font("MS Sans Serif",Font.PLAIN,16));
            }
        });
        JRadioButton courier_new=new JRadioButton("Courier New");
        courier_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextArea.setFont(new Font("Courier New",Font.PLAIN,16));
            }
        });
        ButtonGroup bg=new ButtonGroup();
        bg.add(courier_new);
        bg.add(ms_sans_serif);
        bg.add(times_new_roman);
        menu.add(courier_new);
        menu.add(ms_sans_serif);
        menu.add(times_new_roman);
        return menu;
    }
}
