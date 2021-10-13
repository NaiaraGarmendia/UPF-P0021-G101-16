import java.util.*;

public class TestAirline {
    public static void main(String[]args){
        Airline airline1 = new Airline ("SafeNSlow");
        Airline airline2 = new Airline ( "CheapNFast");

        LinkedList<Airline> airlineList = new LinkedList<Airline>();
        airlineList.add( airline1);
        airlineList.add( airline2);

        for( Airline airline : airlineList){
            airline.printName();
        }
    }
    
}
