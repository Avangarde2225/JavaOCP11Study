package AccessModifiers.AbstractClassAndMethods;

public class Helicopter extends AirCar{

    @Override
    public void land(){
        System.out.println("Heli is landing");
    }

    public static void main(String[] args) {
        AirCar a = new Helicopter();
        a.land();

    }
}
