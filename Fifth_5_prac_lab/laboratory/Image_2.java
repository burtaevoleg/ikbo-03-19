package Fifth_5_prac_lab.laboratory;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Image_2 extends JFrame {
    public static void main(String[] args) {
        new Image_2(args).setVisible(true);
    }

    public Image_2(String []args) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 600);
        JLayeredPane jLayeredPane=getLayeredPane();
        myImage myImage=new myImage(args);
        myImage.setBounds(0,0,600,600);
        jLayeredPane.add(myImage);
    }
}

class myImage extends JPanel{
    private String filepath;
    public myImage(String[] args){
        filepath=args[0];
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        Image image=null;
        try {
            image = ImageIO.read(new File(filepath));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(filepath);
        }
        gr2d.drawImage(image, 50, 50, 300, 300, this);
    }
}
