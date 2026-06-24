// check if two arrays are equal or not 

import java.util.*;

public class CheckArraysEqual {

    public static void main(String[] args) {

        int arr1[] = {1,2,2,3};
        int arr2[] = {2,1,3,2};

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int num : arr1){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }

        for(int num : arr2){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }

        if(map1.equals(map2)){
            System.out.println("Arrays are Equal");
        }
        else{
            System.out.println("Arrays are Not Equal");
        }
    }
}
