package P4CODE;

import java.awt.Color;
import java.util.Arrays;
import java.util.LinkedList;

public class TriangularRegion extends MyPolygon{

    public TriangularRegion(Color lineColor, Color fillColor,MyPoint p1, MyPoint p2, MyPoint p3) {
        super(lineColor, fillColor,new LinkedList<MyPoint>(Arrays.asList(p1,p2,p3)));
      
    }
    public double getArea(){
        return super.getArea();
    }
}
