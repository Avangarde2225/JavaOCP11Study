package AccessModifiers.Interfaces.geography;

import java.util.List;

public class Rectangle {
    private List<Coordinate> coordinates;

    public Rectangle(Coordinate c1, Coordinate c2, Coordinate c3, Coordinate c4){
        if (c1 == null || c2 == null || c3 == null || c4 ==null){
            throw new IllegalArgumentException("Cannot build rectangle");
        }
        this.coordinates = List.of(c1, c2, c3, c4);
    }
//    public boolean containsCoordinate(Coordinate c){
//
//        int maxX = coordinates.stream().mapToInt(Coordinate :: getX).max().getAsInt();
//        int minX = coordinates.stream().mapToInt(Coordinate :: getX).min().getAsInt();
//        int maxY = coordinates.stream().mapToInt(Coordinate :: getY).max().getAsInt();
//        int minXY= coordinates.stream().mapToInt(Coordinate :: getY).min().getAsInt();
//
//        return c.getX() >=minX && c.getX() <= maxX && c.getY() >= minY && c.getY()<=maxY;
//    }
}
