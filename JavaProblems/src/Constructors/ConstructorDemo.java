package Constructors;

public class ConstructorDemo {

    /*
    Have same name as that of class
    Does not have a return type
    Gets Invoked as soon as object of class is created
    */


    //default constructor

    public ConstructorDemo(){
        System.out.println("Constructor Instantiated");
    }

    //parameterized constructor

    public ConstructorDemo(int a, int b){

        System.out.println("sum is " + (a+b));

    }

    public static void main(String Args[]){

        ConstructorDemo demo = new ConstructorDemo(); //o/p - Constructor Instantiated
        ConstructorDemo demo2 = new ConstructorDemo(4,5);

    }

    /*
    Note- if we do not define any constructor in our class, compiler by default calls default
    constructor/implicit constructor on object creation.

    If no constructor is defined then only Java compiler will look for an implicit constructor otherwise it will
    execute the one that is defined
    */


}
