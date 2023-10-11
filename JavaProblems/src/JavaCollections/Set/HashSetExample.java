package JavaCollections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String args[]){

        //HashSet, LinkedHashSet, TreeSet implement set interface in java
        //they cannot contain duplicate values
        //here the order of elements is not sequential
        HashSet <String> hs= new HashSet<String>();
        hs.add("pune");
        hs.add("mumbai");
        hs.add("lko");
        hs.add("delhi");
        hs.add("lko");
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        hs.remove("pune");
        System.out.println(hs);

        //Iterator is used to traverse through each of the object within hashset

        Iterator<String> i = hs.iterator();
        System.out.println(i.next()); //prints the first object
        while(i.hasNext()){
            System.out.println(i.next());  //print all objects
        }


    }
}
