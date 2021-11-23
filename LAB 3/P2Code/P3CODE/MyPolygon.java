package P3CODE;
import java.util.LinkedList;
import java.awt.Graphics;

public abstract class MyPolygon extends MyRegion{
    //Attributes
    protected LinkedList<MyPoint> points;
    //Constructor
    public MyPolygon(LinkedList<MyPoint> points){
        this.points = points;
    }
    //Methods
    public double getArea() {
        double a = (points.get(points.size() - 1).getX() * points.getFirst().getY()) - (points.get(points.size() - 1).getY() * points.getFirst().getX());

        for (int i = 0 ; i < points.size() - 1; i++) {
            a = a + (points.get(i).getX() * points.get(i + 1).getY()) - (points.get(i).getY() * points.get(i + 1).getX()); 
        }

        return Math.abs(a / 2);
    }
    
    public void drawPolygon(Graphics g){
        int nPoints = points.size();
        int xPoints[] = new int[nPoints];
        int yPoints[] = new int[nPoints];

        for (int i = 0; i < points.size(); i++) {
            xPoints[i] = (int) points.get(i).getX();
            yPoints[i] = (int) points.get(i).getY();
        }
        g.drawPolygon(xPoints, yPoints, nPoints);
    }
}
