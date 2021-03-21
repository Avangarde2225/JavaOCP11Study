package AccessModifiers.Demo;

import java.util.List;

import static java.util.List.of;

public class Main2 {
    public static void main(String[] args) {
        List<Shape> airspace = of(
                new Waypoint("CREOL", new LatLon(20.3, 40.7)),
                new Waypoint("ZIDCO", new LatLon(87.1, 20.7)),
                new Waypoint("RYTHM", new LatLon(44.5, 23.2)),
                new Route("ROUTE1",
                        new LatLon(41.3, 34.3),
                        new LatLon(40.3, 2.4),
                        new LatLon(45.3, 2.7))
        );

        airspace.forEach(s -> { System.out.println(s.toWkt());


        });
    }
}
