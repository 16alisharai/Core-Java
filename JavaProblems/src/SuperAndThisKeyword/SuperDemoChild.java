package SuperAndThisKeyword;

public class SuperDemoChild extends SuperDemoParent{

    String name = "Ayushi";

    public void getName(){
        System.out.println(name);
    }

    public void getSuperName(){
        System.out.println(super.name);
    }

    public void getData(){

        super.getData();
        System.out.println("Child Method");

    }



    public static void main(String Args[]){

        SuperDemoChild obj = new SuperDemoChild();
        obj.getName();   //due to overriding Ayushi will be returned in output

        //Here comes significance of super keyword
        //Basically it is used to differentiate between parent and child class objects and methods with same name
        //in this case Alisha will be returned in output

        obj.getSuperName();


        //Differentiating methods using super keyword
        obj.getData();


        //Similar thing we can implement for our parent and child class constructors




    }
}
