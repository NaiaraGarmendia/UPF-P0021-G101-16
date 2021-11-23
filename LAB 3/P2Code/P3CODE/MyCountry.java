package P3CODE;

import java.util.LinkedList;
import java.awt.Graphics;

public class MyCountry extends MyPolygon {

    //Attribute
    private String name;
    private LinkedList<MyCity> cities;
    private LinkedList<MyCountry> neighbors;
    private MyCity capital;

    //Constructor

    public MyCountry(LinkedList<MyPoint> points, MyCity cap, String string) {
        super(points);
        capital = cap;
    }
    
    // method
    public void addCity(MyCity c){
        cities.add(c);
    }

    public void addNeighbor(MyCountry c){
        neighbors.add(c);
    }
    public MyCity getCapital(){
        return capital;
    }
    public String getName(){
        return name;
    }
    public void draw(Graphics g){
        for ( int i = 0; i < cities.size(); i++){
            cities.get(i).drawGeoPoint(g);
        }
        super.drawPolygon(g);
    }

 }  

