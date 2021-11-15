package L1.distancematrix;

public class TestPoint {
    public static void main( String[] args ) {
        GeometricPoint point1 = new GeometricPoint( 12.3, 34.4,"aa");
        GeometricPoint point2 = new GeometricPoint( 10.3, 3,"bb");
        
        point1.printPoint();
        double distance1 = point1.getDistance(point2);
        System.out.println(distance1);
    }
}