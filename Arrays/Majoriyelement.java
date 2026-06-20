// majority element ques brute force approch 

public class Majoriyelement {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {

                System.out.println("Majority Element: " + arr[i]);
                return;
            }
        }
    }
}

// Time Complexity
// Nested loops:
// O(n²)
// Space Complexity
// No extra DS:
// O(1)



// now the less optmized approch for thus ques is that use the hashmap it will give u the good tc but will be taking the sc O(n) whch will be bad 

import java.util.HashMap;

public class Majoriyelement {

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count frequency
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }
        // Check majority element
        for (int key : map.keySet()) {
            if (map.get(key) > arr.length / 2) {
                System.out.println("Majority Element: " + key);
            }
        }
    }
}


// NOW THE MOORE VOTING ALGO SO THAT WE CAN COME TO KNOW THE MAJORITY ELEMENT CONCEPT 

// The algorithm only guarantees that the final candidate is the potential majority element.
// During the cancellation process, many elements get eliminated in pairs. The survivor at the end is the one that could be the majority, but it’s not automatically certain.
// Array = [1,2,3,4]
// Moore’s algorithm might end with candidate = 4.
// But frequency of 4 = 1, and n/2 = 2. So 4 is not a majority element.
// That’s why we must verify by counting the candidate’s actual frequency in the array.


// 🧠 Intuition
// Think of it like an election:

// Moore’s algorithm narrows down the field to one final candidate.

// But before declaring them the winner, you must count the votes to ensure they actually have > 50% support.

// Without this check, you might falsely declare a candidate as majority when they’re not.


public class Majoriyelement {

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int candidate = 0;
        int count = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            }
            else if(num == candidate) {
                count++;
            }
            else {
                count--;
            }
        }
        int freq = 0;
        for (int num : arr) {
            if (num == candidate) {
                freq++;
            }
        }
        if (freq > arr.length / 2) {

            System.out.println("Majority Element: " + candidate);
        }

        else {

            System.out.println("No Majority Element");
        }
    }
}
