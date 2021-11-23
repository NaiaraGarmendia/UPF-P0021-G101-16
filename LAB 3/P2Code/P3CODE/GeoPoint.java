package P3CODE;
import java.awt.Graphics;

public abstract class GeoPoint extends MyPoint {
    //attributes
    protected String name;

    public GeoPoint(int initX, int initY, String n) {
        super(initX, initY);
        name = n;
    }
    public void drawGeoPoint(Graphics g){
        int x = (int)getX();
        int y = (int)getY();
        g.fillOval(x, y, 10, 10);
        g.drawString(this.name, x, y);
    }
    
}
