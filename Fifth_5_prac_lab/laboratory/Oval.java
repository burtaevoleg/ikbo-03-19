package Fifth_5_prac_lab.laboratory;

import java.awt.*;

public class Oval extends Shape {
    private int length;
    private int width;
    public Oval(Color color, int x0, int y0, int length, int width) {
        super(color, x0, y0);
        this.length=length;
        this.width=width;
    }


    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getXVar(),getYVar(),width,length);
    }
}
