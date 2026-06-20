// 977 leetcode 
class Solution {
    public int[] sortedSquares(int[] nums) {
        // isme ye kar sakte h like two pointers lemghe left and the right
        // left ko rakhenge 0 and right ko rakhenghe at n -1 ;
        int left = 0;
        int right = nums.length -1;
        int pos = nums.length - 1;
        int n = nums.length;
        int [] result = new int[n];
        while(left <= right){
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if(leftsq < rightsq){
                // means rightsq bada h and atq wo end me aana chaiye 
                result[pos] = rightsq;
                right--;
            }
            else{
                // means rightsq is less than the leftsq
                result[pos] = leftsq;
                left++;
            }
            pos--;
        }
        return result;
    }
}


// its brute force approch is to square every element and then sort the array 

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}


// Time Complexity
// O(n) - squaring 
// Sorting - O(n log n)
// O(n log n)- total
