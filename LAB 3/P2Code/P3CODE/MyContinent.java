package P3CODE;

import java.util.LinkedList;

public class MyContinent {
    //Attribute
    private LinkedList<MyCountry> countries;
    //Constructor
    public MyContinent(LinkedList<MyCountry> c){
        countries = c;
    }
    // method
     public double getTotalArea(){
        double total_area = 0; 
        int num_elements_i = countries.size(); 
        for(int i = 0; i < num_elements_i; i++){
            total_area = total_area + countries.get(i).getArea();
        }
        return total_area;
    }
    public void draw(java.awt.Graphics g){
        for (int i = 0; i < countries.size(); i++){
            countries.get(i).draw(g);
        }
    }
}
