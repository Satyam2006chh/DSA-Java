class Solution {
    public boolean isPowerOfThree(int n) {
        // power of 3 ka koi rule nahi h jaise power of 2 me tha ki like power of 2 me hmesha binary me 1bit hona chaiye and jaise hi hum n& (n-1) krenge to wo zero de dega 
        // a numher if the power oof 3 if we divide the number again and again by 3 until it becomes 1 
        if(n<=0){
            return false;
        }
        while(n % 3 == 0){
            n =  n / 3;
        }
        return  n == 1;
    }
}



class Solution {
    public boolean isPowerOfTwo(int n) {
        // here the concept of the xor is used 
        // the power of two always have th laast bit as 1 only 1times
        if(n<=0){
            return false;
        }
        return (n & (n-1)) == 0;
    }
}




// subarrays below 


// here we will be understanding the concept of the subarray for the arrays 

// subarray means the continous part of an array .
// continous means that element must stay together and skipping is not allowed

// if the array is  - 
// int[] arr = {1, 2, 3};

// the the subarrays are below = 

// [1]
// [2]
// [3]

// [1,2]
// [2,3]

// [1,2,3]

// [1,3] - this is not the subarray because here the 2 isi skipped

// How Many Subarrays Exist?
// For array of size n

// Total subarrays:

// n * (n+1) / 2;



// printing the subarrays of array - 

// public class Problem_Bits_0{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4};
//         int n = arr.length;
        
//         for(int start = 0; start < n; start++){
//             for(int end = start; end < n; end++){
//                 for(int k = start; k<=end; k++){
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }

// printing the sum of thr subarrays - 
// public class Problem_Bits_0{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4};
//         int n  = arr.length;
        
//         for(int start = 0; start<n; start++){
//             for(int end = start; end < n ; end++){
//                 int sum = 0;
//                 for(int k = start; k<=end; k++){
//                     sum += arr[k];
//                 }
//                 System.out.println(sum);
//             }
//         }
//     }
// }


// counting the number o th subarrays in the array

// public class Problem_Bits_0{
//     public static void main(String[] args){
//         int [] arr = {1,2,3,4};
//         int n = arr.length;
//         int count = 0;
//         for(int start = 0; start < n; start++){
//             for(int end = start; end <n; end++){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }



// Find Maximum Sum Among All Subarrays

// public class Problem_Bits_0{
//     public static void main(String[] args){
//         int[] arr = {1,2,3};
//         int n = arr.length;
//         int max =0;
//         for(int start = 0; start < n; start++){
//             for(int end = start ; end <n; end++){
//                 int sum = 0;
//                 for(int k = start; k<=end; k++){
//                     sum += arr[k];
//                 }if(sum > max){
//                     max = sum;
//                 }
//             }
//         }
//         System.out.println(max);
//     }
// }
