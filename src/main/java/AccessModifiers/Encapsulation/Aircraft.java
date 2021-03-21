package AccessModifiers.Encapsulation;

public class Aircraft {
    private int altitude, speed;

    public int getAltitude(){
        return altitude;
    }

    public void setAltitude(int altitude){
        if (altitude < 0 || altitude > 300){
            throw new IllegalArgumentException();
        }
        this.altitude=altitude;
    }

    public void land(){
        System.out.println("Aircraft Landing");
    }
    public void takeOff(){}

    public static void main(String[] args) {
        Aircraft a = new Aircraft();
        a.land();
    }
}
