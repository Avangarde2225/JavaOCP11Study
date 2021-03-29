package AccessModifiers.Interfaces.airspace;

import AccessModifiers.Interfaces.geography.Circle;
import AccessModifiers.Interfaces.geography.Coordinate;
import AccessModifiers.Interfaces.geography.Rectangle;



public class TMASector {

    private int upperAltitudeFL;
    private Circle shape;


    public TMASector(int upperAltitudeFL, Circle shape) {
        this.upperAltitudeFL = upperAltitudeFL;
        this.shape = shape;
    }



//
//    @Override
//    public boolean isInSector(Coordinate x, int attitude) {
//        if(attitude > this.upperAltitudeFL){
//            return false;
//        }
//        //double distanceToRadius = calculate(x, this.shape.getOrigin());
//       // return distanceToRadius < this.shape.getRadiusNm();
//   // }
}
