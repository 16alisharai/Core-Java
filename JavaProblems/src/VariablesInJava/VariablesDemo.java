package VariablesInJava;

public class VariablesDemo {

    // Instance Variables => value depends on instance / object
    String name;
    String age;
    String phno;

    static int i;

    static String city = "Bangalore"; //static variable which is common to all the objects/ accessible to all the objects
    //all static variables are class variables

    //static block
    static {

        String address;
    }

    public VariablesDemo(String name, String age, String phno){

        this.name= name;
        this.age=age;
        this.phno=phno;

        i++;
        System.out.println(i);


    }

    public static void getInteger(){
        System.out.println(i);   //static methods only accept static variables
    }

    public void getName(){

        System.out.println(name);

    }

    public void getAge(){
        System.out.println(age);
    }

    public void getphno(){
        System.out.println(phno);
    }

    public void getCity(){
        System.out.println(city);
    }

    public static void main(String Args[]){

        VariablesDemo person1 = new VariablesDemo("Ram","24","7098765421");
        VariablesDemo person2 = new VariablesDemo("Sita","26","9990000774");

        person1.getName();
        person2.getName();
        person2.getCity();
        person1.getCity();
        getInteger(); //static methods don't require objects to call them
        VariablesDemo.i=4; //this way we can update value of static variables as well

    }


}
