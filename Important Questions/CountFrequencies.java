// Count the freq using the hashmap 

import java.util.*;
public class CountFrequencies {
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,1,4,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
