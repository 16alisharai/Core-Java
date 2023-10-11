package JavaCollections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    //multiple programs can access at a time thus making it non synchronised
    public static void main(String args[]){

        HashMap <Integer, String> hm = new HashMap<Integer,String>();
        hm.put(0,"a");
        hm.put(1,"b");
        hm.put(2,"c");
        hm.put(3,"d");
        System.out.println(hm.get(2));
        System.out.println(hm);

        Set newSet= hm.entrySet();
        System.out.println(newSet);

        Iterator i= newSet.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }

        while(i.hasNext()){
            Map.Entry mp = (Map.Entry)i.next();  //typecaste
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());

        }



    }
}
