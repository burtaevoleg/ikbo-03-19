package Fifth_5_prac_lab.laboratory;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class Gifka extends JFrame {
    private JFrame frame;
    private static String filename = "src\\Fifth_5_prac_lab\\laboratory\\mario_3.png";

    public static void main(String[] args) {
        new Gifka();
    }

    public Gifka() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel drawPanel = new DrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.setVisible(true);
        frame.setSize(650, 460);
        startGIF();
    }

    static class DrawPanel extends JPanel {
        private Image image;

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D gr2d = (Graphics2D) g;
            try {
                image = ImageIO.read(new File(filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
            gr2d.drawImage(image, 50, 50, 545, 351, this);
        }
    }

    private int index = 0;
    private static final String PATH = "src\\Fifth_5_prac_lab\\laboratory\\";
    String[] images = {"mario_3.png","mario_4.png","mario_6.png","mario_1.png"};

    private void startGIF() {
        while (true) {
            filename = PATH + images[index];
            index = (index + 1) % 4;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            frame.repaint();
        }
    }
}
