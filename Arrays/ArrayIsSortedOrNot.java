class ArrayIsSortedOrNot{
    public boolean check(int[] nums) {
        boolean issorted  = true;
        for(int i= 1; i<nums.length; i++){
            if(nums[i] <= nums[i+1]){
                issorted = false;
                break;
            }
        }
        if(issorted){
            return true;
        }
        else{
            return false;
        }
    }
}
