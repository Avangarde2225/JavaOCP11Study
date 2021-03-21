package AccessModifiers.AbstractClassAndMethods;

public abstract class AirCar {
    private int altitude;

    /*
    When to use abstract classes

    Create a template for future classes
    Share some functionality with future subclasses
    Implement Template method design pattern
     */

    public abstract void land();

    public int getAltitude(){
        return this.altitude;
    }
}
