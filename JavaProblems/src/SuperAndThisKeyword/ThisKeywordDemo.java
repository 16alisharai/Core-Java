package SuperAndThisKeyword;

public class ThisKeywordDemo {

    int a = 5;

    public void value() {
        int a = 3;
        System.out.println(a);
        System.out.println(this.a); //because it is class level

    }

    public static void main(String Args[]){
        ThisKeywordDemo demo = new ThisKeywordDemo();
        demo.value();
    }


    //super- parent class
    //this - object level or class level

}
