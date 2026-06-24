// search in the rotated sorteed array part 2


class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        // its same as the search in rotated sorte arr 1 but there are very slight changes 
        // which we have to do bcoz the arr migh contains the dupkicates here so we have to make sure of some of the edge cases to prevent the error

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
                continue;
            }
            // now check which part of th array is sorted 
            if(nums[start] <= nums[mid]){
                // means the left part is sorted so will be checking for the target inside the left part and if its not present inside that part then will be searching fo that inside the right part

                if(target >= nums[start] && target < nums[mid]){
                    // means left me hi h 
                    end = mid - 1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[end]){
                    // means right me h 
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
