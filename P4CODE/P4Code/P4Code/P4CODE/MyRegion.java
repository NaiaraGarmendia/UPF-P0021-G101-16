package P4CODE;
import java.awt.Graphics;
import java.awt.Color;

abstract public class MyRegion extends Entity {
    protected Color fillColor;

    public MyRegion(Color lcinit, Color fillinit) {
        super(lcinit);
        fillColor = fillinit;
    }
    abstract public boolean isPointInside( MyPoint p );
    abstract public double getArea();
    public void setFillColor(Color fillColor, Graphics g){
        g.setColor(fillColor);
    }
   
}
