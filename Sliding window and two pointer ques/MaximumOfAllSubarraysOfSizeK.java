class Main{
    public static void main(String[] args){
        // Maximum of All Subarrays of Size K
        // means inside the subarray of the size k what u hv to do is check the maxiumum elemen of every subarray of size K
        
        // As here we know ki we have to find the max in subaarray of size K means its the fix length sliding window problem
        
        // Brute- 
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        
        // why the array size is n -k + 1 ?? 
        // here len = 5 and k = 3(window size) 
        // window 1 starts at 0 index
        // window 2 at 1 and window 3 at 2
        // thats it and ther are only 3 windowz 
        // now calc n - k + 1 = 5 - 3 + 1 = 3 = exactly the number if the windows
        // as we have to store the max for each window
        
        
        int index = 0;
        for(int i = 0; i <= n - k; i++){
            int max = nums[i];
            for(int j = i; j < i + k; j++){
                if(nums[j] > max){
                    max = nums[j];
                }
            }
            ans[index++] = max;
        }

        return ans;
    }
}
