package Questions;

public interface TestInterface {
    default void samplingProbeProcedure(){
        probeProcedure();
        System.out.println("Collect Air");
        System.out.println("Fly the game");
        System.out.println("Park the spaceship");
    }
    default void explosionProbeProcedure(){
        probeProcedure();
        System.out.println("Bamboo");
    }
    static void probeProcedure(){
        System.out.println();
        System.out.println();
    }
}
