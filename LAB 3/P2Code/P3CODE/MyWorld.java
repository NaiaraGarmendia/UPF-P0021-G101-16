package P3CODE;

import java.util.LinkedList;

public class MyWorld {
    private LinkedList<MyContinent> continents;
    //Constructor
    public MyWorld(LinkedList<MyContinent> continents){
        this.continents = continents;
    }
     // method
     public double getTotalArea(){
        double total_area = 0; 
        int num_elements_i = continents.size(); 
        for(int i = 0; i < num_elements_i; i++){
            total_area = total_area + continents.get(i).getTotalArea();
        }
        return total_area;
    }

    public void draw(java.awt.Graphics g){
        System.out.println(continents.size());
         for (int i = 0; i < continents.size();i++){
            continents.get(i).draw(g);
        }
    }
}
