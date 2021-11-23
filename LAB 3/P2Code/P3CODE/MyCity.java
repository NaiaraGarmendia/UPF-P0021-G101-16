package P3CODE;

public class MyCity extends GeoPoint{

    private int numhab;

    public MyCity(int initX, int initY, String n, int nh) {
        super(initX, initY, n);
        numhab = nh;
    }

    public int getNumHab(){
        return numhab;
    }


    

}
