package P3CODE;
public class MyPoint {  //We change the atributes from double to int so that we can draw the polygon
    //Attributes
    private int x;
    private int y;
    
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
    
    public void printPoint( ){
        System.out.println(x+","+y);
    }
}   
