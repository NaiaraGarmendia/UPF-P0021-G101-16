package P4CODE;
import java.util.LinkedList;
import java.awt.Color;
import java.awt.Graphics;

public class MyPolygon extends MyRegion{
    //Attributes
    private LinkedList<MyPoint> points;
    //Constructor
    public MyPolygon(Color lcinit, Color fillinit, LinkedList<MyPoint> points){
        super(lcinit,fillinit);
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
    
    public void draw(Graphics g){
        int nPoints = points.size();
        int xPoints[] = new int[nPoints];
        int yPoints[] = new int[nPoints];

        for (int i = 0; i < points.size(); i++) {
            xPoints[i] = (int) points.get(i).getX();
            yPoints[i] = (int) points.get(i).getY();
        }
        g.drawPolygon(xPoints, yPoints, nPoints);
    }



    @Override
    public boolean isPointInside(MyPoint p) {
        int pSize = points.size();
        
        MyPoint p1 = points.get(pSize - 1);
        MyPoint p2 = points.get(0);

        MyVector d1 = p2.difference(p1);
        MyVector d2 = p.difference(p1);

        double a = d1.crossProduct(d2);

        for (int i = 0; i<pSize - 1; i++){
            p1 = points.get(i);
            p2 = points.get(i+1);
            d1 = p2.difference(p1);
            d2 = p.difference(p1);
            double b = d1.crossProduct(d2);

            if(a*b < 0){
                return false;
            }
        }
        return true;
    }



    @Override
    public void translate(int dx, int dy) {
        
    }
}
