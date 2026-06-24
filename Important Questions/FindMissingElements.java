// Find Missing Elements Using Set Difference
// A = {1,2,3,4,5}
// B = {2,4}
// 1
// 3
// 5

import java.util.*;

public class FindMissingElements {

    public static void main(String[] args) {

        int A[] = {1,2,3,4,5};
        int B[] = {2,4};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int num : A){
            set.add(num);
        }

        for(int num : B){
            set.remove(num);
        }

        System.out.println(set);
    }
}
