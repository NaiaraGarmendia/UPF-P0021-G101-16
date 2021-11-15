package L1.distancematrix;
public class GeometricPoint {
    private Double x;
    private Double y;
    private String name;
    
    public GeometricPoint( double initX, double initY, String initName){
        x = initX;
        y = initY;
        name = initName;
    }

    public Double getX(){
        return x;
    }

    public Double getY(){
        return y;
    }
    public String getName(){
        return name;
    }

    public void setX( Double initX ) {
        x = initX;
    }
    public void setY( Double initY ) {
        y = initY;
    }
    public void setName( String initName) {
        name = initName; 
    }
    public Double getDistance(GeometricPoint p){
        Double initX = p.getX();
        Double initY = p.getY();
        Double distance = java.lang.Math.sqrt((initX-x)*(initX-x)+(initY-y)*(initY-y));
        return distance;
    }
    public void printPoint( ){
        System.out.println(name);
        System.out.println(x+","+y);
    }
}   