// first unique element using the map
import java.util.*;

public class FirstUniqueElement {
    public static void main(String[] args) {

        int arr[] = {2,3,4,2,3,5,6};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num : arr){

            if(map.get(num) == 1){
                System.out.println("First Unique = " + num);
                break;
            }
        }
    }
}
