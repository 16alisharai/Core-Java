package Polymorphism;

public class FunctionOverridingChild extends FunctionOverridingParent{

public void vehicleDetails(String vehicle){

    System.out.println("child  "+vehicle);
}

public static void main(String Args[]){
    FunctionOverridingChild obj= new FunctionOverridingChild();

    obj.vehicleDetails("Car");

    //if we comment above method and check the o/p it will print - Parent  Car

    //And if we uncomment and then check the o/p it will print - child  Car

    //This is called method overriding - When two methods have same name and same method signatures.


}
}
