// LEETCODE 3467
class TransformArray {
    public int[] transformArray(int[] nums) {
        int zerocount= 0;
        int countone = 0;
        for(int i= 0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
                zerocount++;
            }
            else{
                nums[i] = 1;
                countone++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(i<zerocount){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        return nums;
        // usinng the arrays .sort() willtake  more space comp - O(logn) OR o(N);
    }
}
