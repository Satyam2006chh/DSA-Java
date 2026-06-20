// rotate the arr to the left by one place 

class RotateArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        for(int nums : arr){
            System.out.println(nums);
        }
    }
}




// now what if the question is asked to rotate the arr by multiple places by the left

class RotateArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int d  = 3;
        int[] temp = new int[d];
        for(int i = 0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i<arr.length; i++){
            arr[i-d] = arr[i];
        }
        // if the size of the arr is 7 and u r asked
        // that ki rotate the arrauy by 3
        // then only 3 p;aces will be occupied which will be starting .
        // from 7-3 index
        // to basically hume n - dspaces se fill krna start karna h 
        
        int j = 0;
        for(int i = arr.length - d; i<arr.length; i++){
            arr[i] = temp[j];
            j++;
        }
        for(int nums : arr){
            System.out.println(nums);
        }
        
    }
}


// but isme problem kya h hum log na space extra use krrre h array 
// for the mostoptmized approich for this quies wht we have to do is that
// reverse the first k and then reverse the n-k and then reverse the whole array 
// u wlll be getting gthe same output 

class Solution {
    public void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // normalize

        if (k == 0) return;

        // Step 1: reverse first k
        reverse(nums, 0, k - 1);

        // Step 2: reverse remaining n-k
        reverse(nums, k, n - 1);

        // Step 3: reverse whole array
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
