package AccessModifiers.Interfaces.geography;

public class Circle {
    public Coordinate getOrigin() {
        return origin;
    }

    public int getRadiusNm() {
        return radiusNm;
    }

    private Coordinate origin;
    private int radiusNm;

    public Circle(Coordinate origin, int radiusNm){
        this.origin = origin;
        this.radiusNm = radiusNm;
    }
}
