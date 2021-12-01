package P4CODE;

import java.awt.Color;

public class CircularRegion extends EllipsoidalRegion{
    
    public CircularRegion(MyPoint center, double radius1,  Color lcinit, Color fillinit) {
        super(center, radius1, radius1, lcinit, fillinit);
    }
public double getArea(){
    return super.getArea();
    }
public boolean isPointInside(MyPoint p){
    return super.isPointInside(p);
    }      
}
    

