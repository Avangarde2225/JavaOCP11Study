package AccessModifiers.Interfaces;

public interface Engine {
/*
Interface:
A reference type that can contain method signatures, default methods, static methods, nested types and constants.

* Interfaces cannot be instantiated
* A class can implement one or more interfaces
* An interface cannot contain a constructor
* Usually  interface methods do not have a body
* Default and static methods have been introduced in recent versons of Java

Why to use interfaces
* abstraction : Hide away implementation details
* Mimic multiple inheritance:

Interfaces can also contain constants
Fields defined in interfaces are public, static and final by default

 */
    void start();
    void stop();
    default String healthCheck(){
        return "OK";
    }

}

class TurboProp implements Engine {

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    public static void main(String[] args) {
        Engine e = new TurboProp();
        e.healthCheck();
    }

}


