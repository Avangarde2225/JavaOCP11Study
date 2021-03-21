package Methods;

public class StaticFields {
    /*
    Static Fiels/Class Variables
    Fields that are associated with the class. Every instance of a class shares a class variable

     */

    String serialNumber;
    public static int currentMode1Nb;

    StaticFields(){
        currentMode1Nb++;

        this.serialNumber = String.format("%08d", currentMode1Nb);
    }

    public static void main(String[] args) {
        StaticFields sm = new StaticFields();
        StaticFields sm2 = new StaticFields();

        System.out.println(sm.serialNumber); // instance field
        System.out.println(sm2.serialNumber);

        System.out.println(StaticFields.currentMode1Nb);
    }

}
