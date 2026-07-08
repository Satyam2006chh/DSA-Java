class Solution {
    public int maximumSumSubarray(int[] nums, int k) {

        int left = 0;
        int sum = 0;
        int maxSum = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}


// optmize

class Solution {
    public int longestSubarray(int[] nums, int k) {

        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
