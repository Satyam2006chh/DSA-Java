// Union and intersection of the arras
import java.util.*;

public class UnionAndIntersection {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8};

        LinkedHashSet<Integer> union = new LinkedHashSet<>();

        for(int num : arr1){
            union.add(num);
        }

        for(int num : arr2){
            union.add(num);
        }

        System.out.println("Union = " + union);

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        System.out.print("Intersection = ");

        for(int num : arr2){

            if(set.contains(num)){
                System.out.print(num + " ");
            }
        }
    }
}
