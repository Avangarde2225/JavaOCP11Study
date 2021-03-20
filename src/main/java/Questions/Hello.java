package Questions;


public class Hello {
    public static void greet(String... args) {
        System.out.println("Hello ");
        for(String arg : args){
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        Hello c = null;
        c.greet();
    }
}
