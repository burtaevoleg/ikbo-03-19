package Fifth_5_prac_lab.laboratory;

import java.awt.*;

public class Square extends Rect {
    private int side;
    public Square(Color color, int x0, int y0, int side) {
        super(color, x0, y0, side,side);
        this.side=side;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getXVar(),getYVar(),side,side);
        g.setColor(getColor());
    }
}
