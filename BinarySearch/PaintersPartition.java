class PaintersPartition {
    public int minTime(int[] arr, int k) {
        int lowest  = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : arr){
            if(num > lowest){
                lowest = num;
            }
            sum += num;
        }
        int low = lowest;
        int high = sum;
        
        int ans = 0;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(ispossible(arr,k,mid)){
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
        int painters_count = 1;
        int summ = 0;
        for(int num : arr){
            if(num > mid){
                return false;
            }
            if(summ + num <= mid){
                summ += num;
            }
            else{
                painters_count++;
                if(painters_count > k){
                    return false;
                }
                summ = num;
            }
            
        }
        return true;
    }
}
