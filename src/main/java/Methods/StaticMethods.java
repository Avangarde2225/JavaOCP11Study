package Methods;

public class StaticMethods {

    static final int AVG_LITERS_PER_SEC = 4;

    public static int calculateNeed(int duratinMin){
        int durationInSec = duratinMin *60;
        return AVG_LITERS_PER_SEC * durationInSec;
    }

    public static void main(String[] args) {
        int twoHourFlight = 120;
        int quantity = calculateNeed(twoHourFlight);

        System.out.println(quantity);
    }

}
