package JavaCollections.List;

import java.util.ArrayList;

public class ArrayListExample {


    //ArrayList, LinkedList, Vector implements list interface in java.
    //they can contain duplicate values
    //it is dynamic


    public static void main(String args[]) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);     //add element
        arr.add(1,4); //add element at particular index
        arr.add(2);
        arr.add(0,5);

        System.out.println(arr);  //print arrayList
        arr.remove(2);      //remove element at particular index
        System.out.println(arr.get(1)); //fetch element at particular index
        System.out.println(arr.contains(6)); //check if element present or not
        System.out.println(arr.indexOf(5));  //returns index of given element
        System.out.println(arr.isEmpty());  //checks if arrayList is empthy
        System.out.println(arr.size());   //returns size of arrayList


    }
}
