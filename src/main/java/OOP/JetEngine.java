package OOP;

public class JetEngine {
    String model;
    int fanSpeed;
    int maxFanSpeed;
    int thrust;

    JetEngine(String model){
        this.model = model;
    }

    JetEngine(String model, int maxFanSpeed){
        this(model);
        this.maxFanSpeed = maxFanSpeed;
    }

    void start(){ }
    void stop(){ }
}

 class methodCall {
    JetEngine trent = new JetEngine("Trent 800", 6000);

}





