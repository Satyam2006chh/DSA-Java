// next permutation

class Solution {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums,0,n-1);
            return;
        }

        // ab pivot milgaya hai and ab hume swap karnah pivot ko with the element which is just greater than the pivot 

        for(int i = n-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        // ab reverse the next part of the pivot because decreasin g me hoga next part

        reverse(nums, pivot+1, n-1); 

        
    }
}
