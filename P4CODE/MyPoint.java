  
package P4CODE;

public class MyPoint {  //We change the atributes from double to int so that we can draw the polygon
    //Attributes
    protected int x;
    protected int y;
    
    //Constructor
    public MyPoint( int initX, int initY){
        x = initX;
        y = initY;
    }
    //Methods
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    
    public void setX( int initX ) {
        x = initX;
    }
    public void setY( int initY ) {
        y = initY;
    }
    
    //transalate method
    public void translate( int dx, int dy ) {
		x = x + dx;
        y = y + dy;
    
	}
    //difference method
    public MyVector difference(MyPoint p){
        int coord1 = p.getX() - x;
        int coord2 = p.getY() - y;
        MyVector vector = new MyVector(coord1, coord2);
        return vector;

    }
    public void printPoint( ){
        System.out.println(x+","+y);
    }
}

