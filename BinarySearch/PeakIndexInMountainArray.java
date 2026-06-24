// peak index in the mountian arr
 

class PeakIndexInMountainArray {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        // here the simple thign we have to keeep in the mind is that the peak element caanot be present at the 0th index and the last index of thw arr so make sure that isme se start ko 0 and end k0 n-1 mt lena wrna kuch comparisons hum aise kr rahe honge joki error denge ki index oout of bounds 
        // so instead of handlng the small small edge cases  which make our code long we will be starting with the start = 1 and end = n-2 so that koi errorr na aaye 
        if(nums.length == 1){
            return 0;
        }
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        int start = 1;
        int end = nums.length - 2;

        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;


            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                // agar aage and peeche walo se bada h to peak h ofc
                result = mid;
                return result;
            }
            else if(nums[mid] > nums[mid-1]){
                // means peeche se to bada h leking aage se nahi means possible ans aage h 
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }
}
