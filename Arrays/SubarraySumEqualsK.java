// Counting the number of subarrrays with the sum  k

// brute approch - On(3)

// public class SubarraySumEqualsK{
//     public static void main(String[] args){
//         int[] arr = {1,2,1,2};
//         int k  = 3;
//         int count = 0;
//         for(int start  = 0; start < arr.length; start++){
//             for(int end = start; end<arr.length; end++){
//                 int sum = 0;
//                 for(int K = start; K<=end; K++){
//                     sum += arr[K];
//                 }
//                 if(sum == k){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }


// now the slight more optimal approch for this with the O(N2);

public class SubarraySumEqualsK{
    public static void main(String[] args){
        int[] arr = {1,2,1,2};
        int k  = 3;
        int count = 0;
        for(int start = 0; start < arr.length; start++){
            int sum  = 0;
            for(int end = start; end<arr.length; end++){
                sum += arr[end];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


// the optimal approch is the prefix sum approch -
