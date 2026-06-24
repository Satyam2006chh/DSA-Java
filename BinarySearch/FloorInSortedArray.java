// floor and the ciel in the sorted array
 

// floor  - Greatest element smaller than or equal to target
// for target = 7
// 2
// 4
// 6 ✅
// 8 ❌
// 10 ❌

// CEIL
// Smallest element greater than or equal to target

// Meaning:

// smallest value >= target

// For target = 7:

// 2 ❌
// 4 ❌
// 6 ❌
// 8 ✅
// 10 ❌

// now the flooor in the sorted array 
public class FloorInSortedArray{
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9};
        int n = arr.length;
        int ans = -1;
        int target = 6;
        // fllor means largets value which is <= target means 5 
        int start = 0;
        int end = n - 1;
        
        while(start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] <= target){
                // means mid chota h and ho sakta hai aage aur large element ho aisa jo target se chota ho
                ans = mid;
                start = mid+1;
            }
            else{
                // means mid > or >= target but hume chota chaiye 
                end = mid-1;
            }
        }
        System.out.println(ans);
    }
}
