package Methods;
/*
Method overloading*******************************
A class can have multiple methods with the same name if their parameter lists are different.
The differantiation is made by the number and type of arguments

Method parameters**********************************
a local variable with the same name as method parameter cannot be declared
you cannot use the same parameter name even if they have the different data types

Field Shadowing********************************
A parameter can have the same name as the field of a class. In this case the parameter is shadowing the field.
to remove the ambiguity we have this keyword

Class JetEnginer{
String model;

JetEngine(String model){
this.model = model;
}
}

Varargs**************************
USe it when you dont know how many arguments of a particular type will be used

public void printRoute(String... points){
}

Passing Parameters*******************************

Pass by value; passing primitive types by value. Changes inside a method does not affect the outher varibles. Needs further elaboration

Pass by reference; passing objects by reference

Arguments vs Parameters************************

Arguments are the real values that are passed when an instance is created using the parameters which are defined variables
 */

public class Aircraft {


}
