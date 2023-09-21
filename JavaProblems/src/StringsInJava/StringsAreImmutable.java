package StringsInJava;

public class StringsAreImmutable {

    /*
    Strings (String literal) are immutable in Java-

   Suppose we have two strings
   String a = "Hello";
   String b = "Hello";

   So we already know that in bg they will point to same object.
   now if we try to change the existing string 'a' say - a.concat("people") and print a then, it will give o/p as hello only.
   this is not possible in Java because as both a and b are pointing to same object it will cause change in b as well

   hence In Java we cannot update/change the existing string.

   But we can definitely create a new string out of it as given below.

   String c = a.concat("people");

     */
    public static void main(String args[]){

        String a = "hello";
        a.concat("people");
        System.out.println(a); //o/p  - hello

        String c = a.concat("people");
        System.out.println("\n"+c); //o/p- hellopeople

    }

    /*To overcome above problems we have StringBuffer and StringBuilder classes which are mutable*/
}
