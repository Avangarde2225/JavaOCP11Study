package Methods.Demo;

public class Main {
    public static void main(String[] args) {
        int altitudeInFeet = 28000;
        double distInNm = 10;

        int altitudeInFl = ConversionHelper.fromFeetToFL(300);
        System.out.println(altitudeInFeet + " ft -> FL" + altitudeInFl);
    }
}
