package StringsInJava;

public class StringBufferAndStringBuilder {

    /*Both these classes i.e StringBuffer and StringBuilder are mutable.*/

    public static void main(String args[]){

        //StringBuffer- Synchronized and Thread Safe
        //If multiple test cases are running in parallel this StringBuffer will ensure serving one test at a time thus ensuring true

        StringBuffer sb = new StringBuffer("helloWorld");

        sb.append("!!!!How are you doing???");
        System.out.println(sb); //o/p- helloWorld!!!!How are you doing???
        sb.reverse();
        System.out.println(sb); //o/p- ???gniod uoy era woH!!!!dlroWolleh
        sb.delete(0,5);
        System.out.println(sb); //o/p- iod uoy era woH!!!!dlroWolleh

        //String Builder- It is not thread safe which means in a program if more controls are trying to access or modify the given string, due to non synchronization it may give us false results.
        //StringBuilder- Non Synchronized , Not Thread Safe , Faster than StringBuffer , not advised to use in case of parallel testing

        StringBuilder sbb= new StringBuilder("What else?");
        sbb.append(" Nothing");
        System.out.println(sbb); //o/p- What else? Nothing

    }
}
