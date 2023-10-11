package JavaCollections.Map;

import java.util.Hashtable;

public class HashTableExample {

    //it is similar to hashmap only
    //difference lies in the fact that it is thread safe.
    //If the table is being access by one function at the same time it cannot be accessed by other
    //we can put null values here
    //we use enumerator instead of iterator to iterate through objects in hashtable


    public static void main(String args[]){

        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(0,"a");
        ht.put(1,"b");
        ht.put(2,"c");
        ht.put(3,"d");
        System.out.println(ht.get(2));
        System.out.println(ht);



    }
}
