package AccessModifiers.Interfaces.radar;

import AccessModifiers.Interfaces.geography.Coordinate;

public class Aircraft2 {
    private String callSign;
    private Coordinate coordinate;
    private int attitudeFL;

    public Aircraft2(String callSign, Coordinate coordinate, int attitudeFL) {
        this.callSign = callSign;
        this.coordinate = coordinate;
        this.attitudeFL = attitudeFL;
    }

    public String getCallSign() {
        return callSign;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public int getAttitudeFL() {
        return attitudeFL;
    }
}

