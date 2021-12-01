package P4CODE;

import java.awt.Color;
import java.awt.Graphics;

public class EllipsoidalRegion extends MyRegion {
    protected MyPoint c;              // center 
    protected double r1;            // radius 
    protected double r2;            // radius

    public EllipsoidalRegion(MyPoint center, double radius1, double radius2, Color lcinit, Color fillinit) {
        super(lcinit, fillinit);
        c = center;
        r1 = radius1;
        r2 = radius2;
    }
 
    public double getArea(){
        return r1 * r2 * Math.PI;
    }
    @Override
    public void draw(Graphics g){
        int width = (int)Math.round(r1);
        int height = (int)Math.round(r2);
        
        g.setColor(fillColor);
        g.fillOval((int) r1, (int) r2, width, height);
        g.setColor(lineColor);
        g.drawOval((int) r1, (int) r2, width, height);
    }



    @Override
    public boolean isPointInside(MyPoint p) {
        double num1 = p.getX()-c.getX();
        double num2 = p.getY()-c.getY();
        double part1 =(Math.pow(num1, 2)/Math.pow(r1,2))+(Math.pow(num2, 2)/Math.pow(r2,2));
        if (part1 <= 1){
            return true;
        } else{
            return false; 
        }
         
               
    }


    @Override
    public void translate(int dx, int dy) {
       int sx = c.getX();
       int sy = c.getY();
       sx = sx + dx;
       sy = sy + dy;
       c.setX(sx);
       c.setY(sy);
    }    
}