package P4CODE;
import java.awt.*;

abstract public class Entity {
	protected Color lineColor;

	public Entity( Color lcinit ) {
		lineColor = lcinit;
	}

	abstract public void draw( java.awt.Graphics g );

	abstract public void translate( int dx, int dy );
	
	public Color getColor(){
		return lineColor;
	}
	public void setColor(Color b){
		lineColor = b;

	}
}
