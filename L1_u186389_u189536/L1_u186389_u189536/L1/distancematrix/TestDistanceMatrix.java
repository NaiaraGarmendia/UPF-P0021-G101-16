package L1.distancematrix;

public class TestDistanceMatrix{
    public static void main(String[]args){
        DistanceMatrix p1 = new DistanceMatrix();

        p1.addCity(0,0,"Madrid");
        p1.addCity(0,750, "Barcelona");
        System.out.println(p1.getCityName(0));
        System.out.println(p1.getNoOfCities());
        System.out.println(p1.getDistance(0,1));


    }
    
}