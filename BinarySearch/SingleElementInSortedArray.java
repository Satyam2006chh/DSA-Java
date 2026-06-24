// single element inside the soreted arr
 

class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        // isme basically ye concept ha
        // agar ek array me perfectly duplicates hai to uska size always evem hoga
        // whereas if there is the presence of the duplicates with the single element diff then the size will always be oddd
        
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        int n = nums.length;
        while(start <= end){
            int mid = start + (end - start) /2;
            // edge cases
            if(nums.length == 1){
                return nums[0];
            }
            if(mid == 0 && nums[0] != nums[1]){
                return nums[mid];
            }
            if(mid == n-1 && nums[n-1] != nums[n-2]){
                return nums[n-1];
            }
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                result = nums[mid];
                return result;
            }
            else if(mid % 2 == 0){
                // mmeans even size array h and if mid-1 = mid hai means peeche even elements reh jayenge jisme ek duplicate h and ek odd rehjayega 
                if(nums[mid-1] == nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                // odd wala caase
                if(nums[mid-1] == nums[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return result;
        
    }
}
