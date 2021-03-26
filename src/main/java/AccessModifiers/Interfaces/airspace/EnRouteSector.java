package AccessModifiers.Interfaces.airspace;

import AccessModifiers.Interfaces.geography.Coordinate;
import AccessModifiers.Interfaces.geography.Rectangle;

public class EnRouteSector implements AirSpace {
    private int lowerAltitudeFL;
    private int upperAltitudeFL;
    private Rectangle shape;

    public EnRouteSector(int lowerAltitudeFL, int upperAltitudeFL, Rectangle shape) {
        this.lowerAltitudeFL = lowerAltitudeFL;
        this.upperAltitudeFL = upperAltitudeFL;
        this.shape = shape;
    }


    @Override
    public boolean isInSector(Coordinate x, int attitude) {
        if (attitude > this.upperAltitudeFL) {
            return false;
        }
        if (attitude < this.lowerAltitudeFL) {
            return false;
        }
        return shape.containsCoordinate(x);
    }
}
