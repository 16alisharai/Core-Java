package Polymorphism;

public class FunctionOverloading {

    //stating difference in methods with difference in number of arguments
    public void getData(String a){
        System.out.println(a);
    }

    public void getData(String a, String b){
        System.out.println(a+b);
    }

    //Stating difference in methods with difference in data type

    public void setData(String a){

        System.out.println(a);

    }
    public void setData(int a){

        System.out.println(a);

    }

    public static void main(String Args[]){

        FunctionOverloading obj = new FunctionOverloading();
        obj.setData("Hello");
        obj.setData(12345);
        obj.getData("Hi"," Friends");
        obj.getData("Hello");

    }
}
