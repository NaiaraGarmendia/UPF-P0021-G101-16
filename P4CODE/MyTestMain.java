package P4CODE;

import java.util.LinkedList;
	

	public class MyTestMain {
	

	    public static void main(String[] args) {
	    
	    EntityDrawer draw = new EntityDrawer();
	    
	    MyPoint center1 = new MyPoint (250 , 250);
	    int r1 = 150;
	    int r2 = 50;
	
	    EllipsoidalRegion e = new EllipsoidalRegion(center1, r1, r2, java.awt.Color.BLUE, java.awt.Color.GREEN);
	

	    
	    System.out.println("The area of the ellipse is " + e.getArea() );
	

	    System.out.println("Is the point (" + center1.getX() +", "+ center1.getY() + ") in the ellipse? " + e.isPointInside(center1) );
	

	    draw.addDrawable(e);
	
	

	    MyPoint center2 = new MyPoint (250, 250);
	    int r = 100;
	    CircularRegion c = new CircularRegion(center2, r, java.awt.Color.BLACK, java.awt.Color.YELLOW);
	    draw.addDrawable(c);
	    System.out.println("The area of the circle is " + c.getArea() );
	    System.out.println("Is the point (" + center2.getX() +", "+ center2.getY() + ") in the cicular region? " + c.isPointInside(center2) );
	

	   
	    LinkedList< MyPoint > points = new LinkedList< MyPoint >();
	        points.add( new MyPoint( 10, 100 ) );
	        points.add( new MyPoint( 150, 10 ) );
	        points.add( new MyPoint( 290, 100 ) );
	        points.add( new MyPoint( 290, 200 ) );
	        points.add( new MyPoint( 150, 290 ) );
	        points.add( new MyPoint( 10, 200 ) );
	

	    MyRegion region1 = new MyPolygon(java.awt.Color.BLACK, java.awt.Color.CYAN, points);
	    draw.addDrawable(region1);
	    MyPoint point1 = new MyPoint( 10, 100 );
	

	    System.out.println("The area of the PolygonalRegion is " + region1.getArea() );
	    System.out.println("Is the point (" + point1.getX() +", " + point1.getY() + ") inside the Polygonal Region? " + region1.isPointInside(point1) );
	

	

	    LinkedList< MyPoint > points1 = new LinkedList< MyPoint >();
	        points1.add( new MyPoint( 10, 100 ) );
	        points1.add( new MyPoint( 150, 35) );
	        points1.add( new MyPoint( 100, 90 ) );
	

	    MyPoint p1 = new MyPoint( 20, 110 );
	    MyPoint p2 = new MyPoint( 40, 210 );
	    MyPoint p3 = new MyPoint( 150, 30 );
	    MyRegion region2 = new TriangularRegion(java.awt.Color.BLACK, java.awt.Color.BLUE, p1, p2, p3);
	    draw.addDrawable(region2);
	

	    System.out.println("The area of the Triangular Region is " + region2.getArea() );
	    System.out.println("Is the point (" + p1.getX() +", " + point1.getY() + " ) inside the Triangular Region? " + region2.isPointInside(p1) );
	

    }
}
	

	

	

	

	

