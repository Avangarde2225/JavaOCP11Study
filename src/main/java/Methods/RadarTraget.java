package Methods;

import static java.lang.System.lineSeparator;

public class RadarTraget {
    private String callSign;
    private int flightLevel;
    private int requiredFlightLevel;
    private String model;

    public RadarTraget(String callSign, int flightLevel, String model){
        this.callSign = callSign;
        this.flightLevel = flightLevel;
        this.requiredFlightLevel = flightLevel;
        this.model= model;
    }
public String getLabel(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.callSign);
        sb.append(lineSeparator());

        sb.append(this.flightLevel).append(this.getClimbDescendIndicator())
                .append(this.requiredFlightLevel);
        sb.append(lineSeparator());

        sb.append(model);
        return sb.toString();
}

}
