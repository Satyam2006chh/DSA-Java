split thr arr largest sum


class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int lowest = Integer.MIN_VALUE;
        int totalsum = 0;
        for(int vals : nums){
            if(vals > lowest){
                lowest = vals;
            }
            totalsum += vals;
        }

        int low = lowest;
        int high = totalsum;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(ispossible(nums,k,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            
            }
        }
        return ans;

    }
    public boolean ispossible(int[] arr, int k, int mid){
        int subarr = 1;
        int sum = 0;
        for(int num : arr){
            if(sum + num <= mid){
                sum+=num;
            }
            else{
                sum = num;
                subarr++;
                if(subarr > k){
                    return false;
                }
            }
        }
        return true;
    }
}
