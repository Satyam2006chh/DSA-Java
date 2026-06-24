// find the highest freq eleement 

import java.util.*;

public class HighestFrequencyElement {

    public static void main(String[] args) {

        int arr[] = {1,2,2,3,3,3,4};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxFreq = 0;
        int answer = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                answer = entry.getKey();
            }
        }

        System.out.println(answer);
    }
}
