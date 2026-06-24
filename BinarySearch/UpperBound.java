// for the upper bound = first element which is > target not >= 



// public class UpperBound{
//     public static void main(String[] args){
//         int[] arr = {1,2,4,4,4,6,8};
//         int n = arr.length;
//         int target = 4;
//         int ans = -1;
        
//         int start = 0;
//         int end = n-1;
//         while(start <= end){
//             int mid = start + (end - start)/2;
//             if(arr[mid] > target ){
//                 ans = mid;
//                 end = mid - 1;
//                 // agar mid > target means mid is possble ans but we need the first ans
                
//             } 
//             else{
//                 // means mid jo hai wo < target means ans to midse aage milega that whyy go aheaddddd
//                 start = mid+1;
//             }
//         }
//         System.out.println(ans);
//     }
// }
