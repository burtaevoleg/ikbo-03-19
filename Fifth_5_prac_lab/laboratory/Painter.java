package Fifth_5_prac_lab.laboratory;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Painter extends JFrame {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;

    public static Shape choseShape() {

        Random random = new Random();
        int index=random.nextInt(4);
        switch (index) {
            case 0:
                return new Oval(choseColor(), chose_first(), chose_first(), choseSide(), choseSide());
            case 1:
                return new Circle(choseColor(), chose_first(), chose_first(), choseSide());
            case 2:
                return new Rect(choseColor(), chose_first(), chose_first(), choseSide(), choseSide());
            case 3:
                return new Square(choseColor(), chose_first(), chose_first(), choseSide());
        }
        return new Oval(choseColor(), chose_first(), chose_first(), choseSide(),choseSide());
    }

    public static int choseSide() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int chose_first() {
        Random random = new Random();
        return random.nextInt(600);
    }

    public static Color choseColor() {
        Random random = new Random();
        return Color.getHSBColor(random.nextFloat(), random.nextFloat(), random.nextFloat());
    }

    public Painter() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        for (int j = 0; j < 20; j++) {
            Shape figure = choseShape();
            figure.setBounds(0, 0, WIDTH, HEIGHT);
            lp.add(figure);
        }
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Painter();
    }
}
