package P4CODE;

import java.awt.Color;
import java.util.Arrays;
import java.util.LinkedList;

public class RectangularRegion extends MyPolygon{
    public RectangularRegion(Color lineColor, Color fillColor,MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4){
        super(lineColor, fillColor,new LinkedList<MyPoint>(Arrays.asList(p1,p2,p3,p4)));
    }

    public double getArea(){
        return super.getArea();
    }



    
}
