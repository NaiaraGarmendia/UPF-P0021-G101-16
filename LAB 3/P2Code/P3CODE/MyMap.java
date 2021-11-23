package P3CODE;

import java.util.LinkedList;
public class MyMap extends javax.swing.JPanel {
    private MyWorld world1;


    public MyMap() {
        initComponents();
        
        LinkedList< MyPoint > points = new LinkedList< MyPoint >(); // points for the first city
        points.add( new MyPoint( 10, 100 ) );
        points.add( new MyPoint( 150, 10 ) );
        points.add( new MyPoint( 290, 100 ) );
        points.add( new MyPoint( 290, 200 ) );
        points.add( new MyPoint( 150, 290 ) );
        points.add( new MyPoint( 10, 200 ) );

        LinkedList< MyPoint > points2 = new LinkedList< MyPoint >(); // points for the second city
        points2.add( new MyPoint( 100, 400 ) );
        points2.add( new MyPoint( 300, 500 ) );
        points2.add( new MyPoint( 200, 400 ) );
        
        LinkedList< MyCity > cities = new LinkedList< MyCity >(); // cities for the country
        cities.add( new MyCity( 80,100, "Tokio",1000) );
        cities.add( new MyCity( 180, 70, "Mexico City",2000) ); 
        cities.add( new MyCity( 500, 200, "	London" ,1500) );
        cities.add( new MyCity( 250, 100, "Los Angeles", 2500 ) );

        LinkedList< MyCity > cities2 = new LinkedList< MyCity >(); // cities for the country   
        cities2.add( new MyCity( 130, 500, "bb", 200 ) );
        cities2.add( new MyCity( 300, 600, " cc", 300) );
        cities2.add( new MyCity( 200, 500, "dd", 400 ) );

    
        LinkedList<MyCountry> countries = new LinkedList<MyCountry>();

        MyCity capital = new MyCity( 100, 70, "Buenos Aires",2000) ; 
        MyCountry country1 = new MyCountry(points, capital, "Argentina");
        countries.add(country1);
        for (MyCity c : cities){
            country1.addCity(c);
        }
    
        
        MyCity capital2 = new MyCity(200,40 ,"Vienna",3000);
        MyCountry country2 = new MyCountry(points2, capital2,"austria" );
        countries.add(country2);
        for (MyCity c : cities){
            country1.addCity(c);
        }
    

        
        MyContinent continent = new MyContinent(countries);
        LinkedList<MyContinent> world = new LinkedList<MyContinent>();
        world.add(continent);
        

        world1 = new MyWorld(world);

        System.out.println( world1.getTotalArea() );
    }

    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
    }

    public void paint( java.awt.Graphics g ) {
        super.paint( g );
        world1.draw( g );
    }

}

