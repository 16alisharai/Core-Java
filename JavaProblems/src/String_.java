public class String_ {

    public static void main(String args[]) {

        //String is a class in java
        String a = "helloWorld"; //string literal , backend performs strings class
        String b = " hello people ";
        String ab = new String("hello"); //with string class

    /*this is useful when we have two strings which are same
    for eg-
    a = "hello";
    b = "hello";

    In background the compiler created an object of string class and assigned this value to it.
    Now again when compiler encounters similar string , it does not create a separate object rather it assigns the string to same object.

    */

        //String Methods

        System.out.println(a.charAt(0));
        System.out.println(a.indexOf('e')); //if no element with e then it will print index as -1
        System.out.println(a.substring(0,5)); //(start index, end+1 index)
        System.out.println(a.substring(5)); //end value not given then it will print till end of the string
        System.out.println(a.concat("!!!"));
        System.out.println(b.trim());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        String arr[]= a.split(" ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"/");
        }

        System.out.println(a.replace('l','t')); //replaces the character with the mentioned charachter in whole string

    }

}
