package L1.distancematrix;
//import java.lang.reflect.Array;
import java.util.LinkedList;
//import javax.naming.LinkException;

public class DistanceMatrix implements Matrix{
    private LinkedList<GeometricPoint> cities;
    private LinkedList<LinkedList<Double>> matrix;
    
    public DistanceMatrix(){
        cities = new LinkedList<GeometricPoint>();
        matrix = new LinkedList<LinkedList<Double>>();
    }

    public void addCity(double x, double y, String name){
        GeometricPoint city = new GeometricPoint(x, y, name); //ns si es con init o no, pensava q si pero sale error si lo pones
        cities.add(city);
    }
    
    public String getCityName(int index){
        if (index >= 0 && index <cities.size()){
            return(cities.get(index).getName());
        }
        else{
            return("Index is not correct");
        }
    }

    public int getNoOfCities(){
        return cities.size();
    }
    


    public void createDistanceMatrix(){
        matrix.clear();
        int numCities = getNoOfCities();
        for(int i=0; i<numCities; i++){
            matrix.add(new LinkedList<Double>());
            for(int j=0; j<numCities; j++){
                double dis = getDistance(i,j);
                matrix.get(i).add(dis);

            }
        }

    }

    public double getDistance(int index1, int index2) {
        GeometricPoint  p1 = cities.get(index1);
        GeometricPoint p2 = cities.get(index2);
        return p1.getDistance(p2);
    }
    }
