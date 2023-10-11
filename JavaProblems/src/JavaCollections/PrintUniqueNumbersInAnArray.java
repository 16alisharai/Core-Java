package JavaCollections;

import java.util.*;

public class PrintUniqueNumbersInAnArray {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n= sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer>  hm= new HashMap<>();
        Set <Integer> set = new HashSet<>();


        System.out.println("Enter the elements in array");

        for(int i=0; i<n ; i++){
            arr.add(sc.nextInt());
        }



        for(int i=0; i<arr.size(); i++){

            hm.put(arr.get(i), hm.getOrDefault(arr.get(i),0)+1);

        }

        for(int i: hm.values()){
            if(!set.contains(i)){
                set.add(i);
            }
            else System.out.println(" All elements have unique frequency");
            break;
        }
        System.out.println("Contains elements with same frequency");
        System.out.println(hm);


    }

}
