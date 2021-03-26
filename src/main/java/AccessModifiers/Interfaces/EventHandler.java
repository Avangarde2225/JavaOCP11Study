package AccessModifiers.Interfaces;


@FunctionalInterface
public interface EventHandler {
    /*

     */
    void handle();

    EventHandler onStart = () -> {
        System.out.println("Program Started");
    };

    public static void main(String[] args) {
        onStart.handle();
    }
}

