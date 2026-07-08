class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // so brute me ye rhega ki generate all the subarray and check for the maximum one consecitive
        int max = 0;
        for(int i= 0; i<nums.length; i++){
            int count = 0;
            for(int j = i; j<nums.length; j++){
                if(nums[j] == 1){
                    count++;
                    max = Math.max(max,count);
                }
                else{
                    // means nums[j] is not 1 its somethign else;
                    break;
                }
            }
        }
        return max;



        // optimal
        int maxcnt = 0;
        int count = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i] == 1){
                count++;
                maxcnt = Math.max(maxcnt,count);
            }
            else{
                count = 0;
            }
        }
        return maxcnt;
    }
}
