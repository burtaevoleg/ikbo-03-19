package Fifth_5_prac_lab.laboratory;

import java.awt.*;

public class Circle extends Oval {
    public int side;
    public Circle(Color color, int x0, int y0, int side) {
        super(color, x0, y0,side,side);
        this.side=side;
    }


    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getXVar(),getYVar(),side,side);
    }
}
