package OOP;

public class JetEngine {
    String model;
    int fanSpeed;
    int maxFanSpeed;
    int thrust;

    JetEngine(){System.out.println("no arg");}

    JetEngine(String model){
        this();
        System.out.println("Model");
    }

    JetEngine(String model, int maxFanSpeed){
        this(model);
        this.maxFanSpeed = maxFanSpeed;
        System.out.println("model, maxFanSpeed");
    }

    void start(){ }
    void stop(){ }
}

 class methodCall {
     public static void main(String[] args) {


         JetEngine trent = new JetEngine("Trent 800", 6000);
         JetEngine trent800 = trent;
         new JetEngine("Trent 8000", 5000);

     }
}





