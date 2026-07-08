class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // brute force = generate all the subarrays and check every subarrau according to the conditions 
        // int minlen = Integer.MAX_VALUE;
        // for(int i = 0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j<nums.length; j++){
        //         sum += nums[j];
        //         if(sum >= target){
        //             minlen = Math.min(minlen, j-i+1);
        //         }
        //     }
        // }
        // if(minlen == Integer.MAX_VALUE){
        //     return 0;
        // }
        // return minlen;


        // now for the optmized we will be using the sliding window approch and there is no resteiction on subar len so use the variable sized window 

        int left = 0;
        int minlen = Integer.MAX_VALUE;
        int sum = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                minlen = Math.min(minlen, right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        if(minlen == Integer.MAX_VALUE){
            return 0;
        }
        return minlen;
    }
}
