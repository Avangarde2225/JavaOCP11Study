package Variables;

import OOP.JetEngine;

public class DataTypes {
    String model; //instance variable
    int maxThrust;  //instance variable
    private int fanSpeed;  //instance variable

    /* instance variables
    Objects store their individual state in non static fields
    They are unique to the every instance of a class
    they can have access modifiers
     */
    static int nbInstances = 0; // class variable
    //e.g.: int enginesCreated = JetEngine.nbInstances;
    /*
    use static modifier
    class variables are unique to the class rather than an instance
    if you add FINAL word and make it constant
     */

    /*Local Variables
    They are declared in a method and only visible to the methods that declare them
     */


}
