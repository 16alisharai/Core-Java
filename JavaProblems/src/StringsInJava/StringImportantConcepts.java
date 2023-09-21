package StringsInJava;

public class StringImportantConcepts {

    public static void main(String Args[]) {

    /* == operator compares the reference
       whereas, .equals compares the value
    */

        String a = "hello";
        String b = "hello";

        String c = new String("hello");

        System.out.println(a.equals(b)); //True
        System.out.println(a.equals(c)); //True
        System.out.println(a==b);    //True
        System.out.println(a==c);  //False  because not referring to same object

    }
}
