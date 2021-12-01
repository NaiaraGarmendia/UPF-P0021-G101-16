package P4CODE;

import java.awt.Color;

public class MyTestMain {
    public static void main(String[] args) {
        EntityDrawer drawer = new EntityDrawer();
        MyPoint c1 = new MyPoint (250, 250);
        int r1 = 150;

        CircularRegion circle = new CircularRegion(c1, r1, Color.BLUE, Color.GREEN);
        drawer.addDrawable(circle);
    }
}
