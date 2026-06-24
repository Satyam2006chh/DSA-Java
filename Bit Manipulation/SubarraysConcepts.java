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

// public class SubarraysConcepts{
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
// public class SubarraysConcepts{
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

// public class SubarraysConcepts{
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

// public class SubarraysConcepts{
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
