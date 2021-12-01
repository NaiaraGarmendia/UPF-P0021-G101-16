package P4CODE;

public class MyVector extends MyPoint{

    public MyVector(int initX, int initY) {
        super(initX, initY);
    }
    //cross product method
    public double crossProduct(MyVector vector1){
        int op1 = x * vector1.getY();
        int op2 = y * vector1.getX();
        double result = op1 - op2;
        return result;
    }
}