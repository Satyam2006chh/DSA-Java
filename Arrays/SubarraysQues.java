// class Main {
//     public static void main(String[] args) {
//         // Very brute force approch with the tc = On3
//         int[] arr = {2,3,4,5};
//         int n = arr.length;
//         for(int i= 0; i<n; i++){
//             for(int j= i; j<n; j++){
//                 for(int k = i; k<=j; k++){
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println();
//             }
           
//         }
//     }
// }

// but what if u r asked to find the sum of every subarray ??


class Main {
    public static void main(String[] args) {
        int[] arr = {2,5,7,1};
        int n = arr.length;
        for(int i= 0; i<n; i++){
            int sum = 0;
            for(int j= i; j<n; j++){
                sum += arr[j];
                System.out.println(sum);
            }
        }
    }
}


// sum with the subarray printing
// class Main {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) {
//                 sum += arr[j];
//                 System.out.print("Subarray: ");
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println(" | Sum = " + sum);
//             }
//         }
//     }
// }


// Maximum subarray sum
class Main{
    public static void main(String[] args){
        int[] arr = {2, -1, 3, -2};
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        // Find the maximum sum among all possible subarrays.
        // "Among all the subarrays, which one has the largest sum?"
        for(int i =0 ; i<n; i++){
            int sum = 0;
            for(int j= i; j<n; j++){
                sum += arr[j];
                maxsum = Math.max(maxsum,sum);
            }
        }
        System.out.print(maxsum);
    }
}



// kadanee algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        
        for(int num : nums){
            currentsum += num;
            maxsum = Math.max(maxsum,currentsum);
            // why we are calc this maxsum before seetting currsum to zero because 
            // kahi cases hote h jisme manlo arr = {-2} ho yaha to maxsum = -2 h
            // agar yaha hi tumne currsum ko pehle zero krdia to max to hoga hi nahi kuch
            if(currentsum < 0){
                currentsum = 0;
            }
        }
        return maxsum;
    }
}

// count the subarrays with the even sum

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int count = 0;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println("Number of subarrays with even sum: " + count);
    }
}

// leetcodde1248 brute
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int oddcount = 0;
       for(int i= 0; i<nums.length; i++){
        int odd = 0;
        for(int j= i; j<nums.length; j++){
            if(nums[j] % 2 != 0){
                odd++;
            }
            if(odd == k){
                oddcount++;
            }
        }
       }
       return oddcount;

    }
}
