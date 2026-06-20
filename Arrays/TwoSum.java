// Here the first question is about the 2sum

// brute
public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair Found:");
                    System.out.println(arr[i] + " " + arr[j]);
                    System.out.println("Indices:");
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println("No Pair Found");
    }
}

// here the tc = O(n²)and trhe sc = O(1);

// Optimal Approach — Two Pointer Technique
// BUT MAKE SURE THAT FOR USING THE TWO POINTER APPROCH THE ARRAY MUST BE SORTED WHICH IS THE MUST 

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {7, 2, 11, 15};
        int target = 9;
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair Found:");
                System.out.println(arr[left] + " " + arr[right]);

                return;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        System.out.println("No Pair Found");
    }
} 

// Complexity	Value
// Time Complexity	O(n log n)
// Space Complexity	O(log n)
