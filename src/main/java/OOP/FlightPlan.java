package OOP;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class FlightPlan {
    String id;
    String departure;
    String destination;
    LocalDateTime departureTime;
    List<String> route;

    private FlightPlan(){
        System.out.println("flightPlan()");
        this.id = UUID.randomUUID().toString();
    }
    FlightPlan(String departure, String destination){
        this();

        if (departure == null || destination ==null){
            throw new IllegalArgumentException();
        }
        System.out.println(String.format("flightPlan(%s, %s)", departure, destination));

        this.departure = departure;
        this.destination = destination;
    }

    FlightPlan(String departure, String destination, LocalDateTime departureTime, List<String> route){
        this(departure, destination);

        if (departure == null || route == null){
            throw new IllegalArgumentException();
        }

        System.out.println(String.format("FlightPlan(%s,%s,%s,%s)",
                departure,
                destination,
                departureTime.toLocalTime(),
                route.toString()));

        this.route = route;
        this.departureTime = departureTime;
    }

    public void print() {
        String msg = "{" +
                "id'" + this.id + '\'' +
                "departure='" + this.departure + '\'' +
                ", destination='" + this.destination + '\'' +
                ", departureDateTime =" + this.departureTime +
                ", route= " + this.route + '}';
        System.out.println(msg);


    }

    public static void main(String[] args) {
        FlightPlan berlintoBucharest = new FlightPlan( "BER", "OTP");
        berlintoBucharest.print();
        System.out.println();

        FlightPlan parisToLondon = new FlightPlan("PAR", "LON",LocalDateTime.of(2021,03,18,23,14 ),
                List.of("PAR","LON","FARAR","MARAR","ARAR"));
        parisToLondon.print();
    }

}
