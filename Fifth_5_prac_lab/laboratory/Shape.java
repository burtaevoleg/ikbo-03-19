package Fifth_5_prac_lab.laboratory;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {

    private int x;
    private int y;
    private Color color;
    private String text;

    public Shape(Color color,int x, int y) {
        this.x = x;
        this.y = y;
        this.color = color;
        setOpaque(false);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public int getXVar() {
        return x;
    }

    public void setXVar(int x) {
        this.x = x;
    }

    public int getYVar() {
        return y;
    }

    public void setYVar(int y) {
        this.y = y;
    }
}

