package Inheritance;

public class ChildClass extends ParentClass {

    public void Color(){
        System.out.println(color); //Accessed directly from parent
    }
    public static void main(String Args[]){
        ParentClass obj = new ParentClass();  //Object of parent class inherit method of parent class
        obj.Brakes();

    }

}

