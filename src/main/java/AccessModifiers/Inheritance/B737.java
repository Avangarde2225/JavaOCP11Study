package AccessModifiers.Inheritance;

import AccessModifiers.Encapsulation.Aircraft;

public class B737 extends Aircraft {
    private String wakeTurbulance;

    /*
    The inherited fields can be used directly
    the inherited methods can be used directly
    You can create new instance fields in the subclass that do not exist in the super class
    You can create new instance methods in the subclass that dod not exist in the superclass
    You can override the existing instance methods
    You can invoke the constructor of the superclass by using the "super" keyword

    Method OVerriding(only exist in the inheritance)

    The ability of a subclass to modify an existing method. The overriding method has the same name, number and type of parameters and return type
    private methods cannot be overriden
     */
    @Override
    public void land() {
        super.land();
        System.out.println("B737 is landing");
    }


    public static void main(String[] args) {
        B737 b = new B737();
        b.land();
    }

}
