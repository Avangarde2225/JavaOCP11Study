package Methods;

public class StaticMethods {
    /*
    Static Fiels/Class Variables
    Fields that are associated with the class. Every instance of a class shares a class variable

     */

    String serialNumber;
    public static int currentMode1Nb;

    StaticMethods(){
        currentMode1Nb++;

        this.serialNumber = String.format("%08d", currentMode1Nb);
    }

    public static void main(String[] args) {
        StaticMethods sm = new StaticMethods();
        StaticMethods sm2 = new StaticMethods();

        System.out.println(sm.serialNumber); // instance field
        System.out.println(sm2.serialNumber);

        System.out.println(StaticMethods.currentMode1Nb);
    }

}
