// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.


// public class SearchInsertPosition{
//     public static void main(String[] args){
//         int[] arr = {1,3,5,6};
//         int start = 0;
//         int n = arr.length;
//         int end = n-1;
//         int target =2;
        
//         int result = arr.length;
        
//         while(start <= end){
//             int mid = start + (end - start) /2;
//             if(arr[mid] == target){
//                 // means target is already presetn inside the arr we do not have to see the insertion pos only retiurn the ans 
//                 result = mid;
//                 break;
//             }
//             else if(arr[mid] >= target) {
//                 // /yaha ye jab aayega jab ye mid me na ho to lower bound ka concept lagana pdega yaha par hume 
//                 result = mid;
//                 end = mid-1;
                
                
//             }
//             else{
//                 start = mid+1;
//             }
//         }
//         System.out.println(result);
//     }
// }
