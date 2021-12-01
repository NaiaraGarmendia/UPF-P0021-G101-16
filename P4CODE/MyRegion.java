package P4CODE;

import java.awt.Color;

abstract public class MyRegion extends Entity {
    protected Color fillColor;

    public MyRegion(Color lcinit, Color fillinit) {
        super(lcinit);
        fillColor = fillinit;
    }
    abstract public boolean isPointInside( MyPoint p );
    //public Double getArea(){ // es opcional, para hacerlo despues

    public Color getFillColor(){
        return fillColor;
    }
    public void setFillColor(Color a){
        fillColor = a;
    }
    
}
