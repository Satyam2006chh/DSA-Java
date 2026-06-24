// lower bound  - means first element which is greater than or equal to the target 
// its very usefull bcoz it helps us in getting the insertion position in the array

// public class LowerBound{
//     public static void main(String[] args){
//         int[] arr = {1,2,4,4,4,6,8};
//         int n = arr.length;
//         int target = 4;
//         int ans = -1;
        
//         int start = 0;
//         int end = n-1;
//         while(start <= end){
//             int mid = start + (end - start)/2;
//             if(arr[mid] >=  target ){
//                 ans = mid;
//                 end = mid - 1;
//                 // bcoz agar mid >= target means aage jitne bhielement honge they all will be greate than or eq to target but we means the first element >= target so for the loweer bound 
                
//             } 
//             else{
//                 // means the mid is not >= target so we will be doing the mid + 1 bcoz us case me bada element mid se aage hi hoga frr sure 
//                 start = mid+1;
//             }
//         }
//         System.out.println(ans);
//     }
// }
