// search in rotated sorted arr 1

class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        // agar koi bhi arr was in the asc order and if its rotated then one of its part always remains sorted chahe kuch bhi hojaye 
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while(start <= end){
            int mid = start + (end - start) /2;
            if(nums[mid] == target){
                // means mid par hi pda h we dont have to search in anywhere or there is no need of the complex searching rules 
                result = mid;
                return result;
            }
            // now we will be checking either the left part is sorted or the right part is sorteed so that wr can decide that where we have to search 
            if(nums[start] <= nums[mid]){
                // means the left part is sorted and we have to search inside tghe left part 
                if(target >=nums[start] && target < nums[mid]){
                    // means left part sorted to hai hi and element jo hum dhoond rahe h wo left part me hi sorrtd hai 
                    end = mid - 1;
                }
                else{
                    // means the left part was sorted byut the element is not inside that part so there is no need for searching the element in the left part anymore 
                    start = mid+1;
                }
            }
            else{
                // means the right part is sorted and we have to check whether the element is present insdie that par or not ? 
                if(target > nums[mid] && target <= nums[end]){
                    // means right part to sorted hai and element bhii roght me h 
                    start = mid + 1;
                }
                else{
                    // right sorted hai lekin target not inside the right to search insde the left
                    end = mid-1;
                }
            }
        }
        return result;
    }
}
