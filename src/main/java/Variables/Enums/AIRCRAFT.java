package Variables.Enums;

public class AIRCRAFT {


    private final String model;
    private  final WakeTurbulance wakeTurbulance;
    private final int modeADecimal;

    public AIRCRAFT(String model, WakeTurbulance wakeTurbulance, int modeADecimal) {
        this.model = model;
        this.wakeTurbulance = wakeTurbulance;
        this.modeADecimal = modeADecimal;
    }


    public String getModel() {
        return model;
    }

    public WakeTurbulance getWakeTurbulance() {
        return wakeTurbulance;
    }

    public int getModeADecimal() {
        return modeADecimal;
    }





}
