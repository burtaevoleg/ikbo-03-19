package Sixth_6_prac_lab.LAB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Task_2 {
    public static void main(String[] args) {
        new Mouse().setVisible(true);
    }
}

class Mouse extends JFrame{

    JPanel jPanel;
    JDialog dialog=new JDialog();
    public Mouse(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        jPanel=new JPanel();
        jPanel.setLayout(new BorderLayout());
        JButton center=new JButton("Center");

        center.addMouseListener(new MouseAdapter() {
            JDialog jDialog;
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                jDialog=createDialog("Добро пожаловать в");
                jDialog.setVisible(true);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                jDialog.dispose();
            }
        });

        JButton west=new JButton("West");
        west.addMouseListener(new MouseAdapter() {
            JDialog jDialog;
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                jDialog=createDialog("Добро пожаловать в Джидда");

                jDialog.setVisible(true);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                jDialog.dispose();
            }
        });

        JButton south=new JButton("South");
        south.addMouseListener(new MouseAdapter() {
            JDialog jDialog;
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                jDialog=createDialog("Добро пожаловать Абха");
                jDialog.setVisible(true);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                jDialog.dispose();
            }
        });

        JButton north=new JButton("North");
        north.addMouseListener(new MouseAdapter() {
            JDialog jDialog;
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                jDialog=createDialog("Добро пожаловать в");
                jDialog.setVisible(true);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                jDialog.dispose();
            }
        });

        JButton east=new JButton("East");
        east.addMouseListener(new MouseAdapter() {
            JDialog jDialog;
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                jDialog=createDialog("Добро пожаловать в Дахране");
                jDialog.setVisible(true);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                jDialog.dispose();
            }
        });



        jPanel.add(center,BorderLayout.CENTER);
        jPanel.add(south,BorderLayout.SOUTH);
        jPanel.add(north,BorderLayout.NORTH);
        jPanel.add(east,BorderLayout.EAST);
        jPanel.add(west,BorderLayout.WEST);
        add(jPanel);
        setLocationRelativeTo(null);
    }

    private JDialog createDialog(String text){
        JDialog dialog = new JDialog(this,"Dialog");
        JLabel label=new JLabel(text);
        dialog.add(label);
        dialog.setSize(300, 90);
        dialog.setLocationRelativeTo(null);
        return dialog;
    }
}
