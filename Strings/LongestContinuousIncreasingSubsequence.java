leetcode 674

class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        // hume longest len return krni h increasing subsequence ki 
        int longestlen = 1;
        int currlen = 1;
        for(int i= 1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                currlen++;
            }
            else{
                currlen = 1;
            }
            longestlen = Math.max(longestlen, currlen);
        }
        return longestlen;
    }
}
