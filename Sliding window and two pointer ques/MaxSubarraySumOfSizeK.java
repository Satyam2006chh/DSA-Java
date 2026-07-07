// Maximum sum subarray of size K
// mneans u r given an array and u hv to find the max sum of thr subarray of th size k 

// in the brute u will be generating all the subarrays and then checking according to the conditons 

class Solution{
    public static void main(String[] args){
        int[] arr = {2,1,5,1,3,2};
        int n = arr.length;
        int k = 3;
        int maxsum = 0;
        for(int i= 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<i+k; j++){
                sum += arr[j];
            }
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
}

// optmized approach 

class Solution{
    public static void main(String[] args){
        int[] arr = {2,1,5,1,3,2};
        int n = arr.length;
        int k = 3;
        int maxsum = 0;
        int left = 0;
        int sum = 0;
        for(int right = 0; right < n; right++){
            sum += arr[right];
            if(right - left + 1 == k){
                maxsum = Math.max(maxsum,sum);
                sum -= arr[left];
                left++;
            }
        }
        return maxsum;
    }
}
