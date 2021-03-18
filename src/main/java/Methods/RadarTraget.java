package Methods;

import java.util.concurrent.ExecutorService;

import static java.lang.Math.random;
import static java.lang.System.lineSeparator;
import static java.lang.System.out;
import static java.lang.Thread.sleep;
import static java.util.concurrent.Executors.newSingleThreadExecutor;

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

    private String getClimbDescendIndicator() {
    if(this.requiredFlightLevel > this.flightLevel) {
        return "up";
    }
    if(this.requiredFlightLevel < this.flightLevel){
        return "down";
    }
    return "=";
    }
    public void changeAltitude(int newFl){
        out.println(this.callSign + "change altitude" + newFl);
        out.println();

        this.requiredFlightLevel = newFl;

        ExecutorService es = newSingleThreadExecutor();
        es.execute(() -> {
            try {
                sleep((long)(random() *5*1000));
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            this.flightLevel = requiredFlightLevel;
                });
    }

    public static void main(String[] args) throws InterruptedException {
        RadarTraget os791 = new RadarTraget("OS791", 280, "B737-Max10");
        out.println(os791.getLabel());
        out.println();

        os791.changeAltitude(200);

        for (int i = 0; i < 5; i++) {
            sleep(1000);
            out.println(os791.getLabel());
            out.println();

        }
    }

}
