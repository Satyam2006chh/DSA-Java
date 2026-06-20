// Maximum consecutive ones 

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // so basically is ques ke liye me ye approch rakhunga ki 
        // me iterate krunga aray me and jaha one aaya pehle usko count krlungha
        // and jaise hi koi other element aaya other than 1 i will keep the count to be zero 
        // but before seetting th count there will be a var which will be recording the max streak for the one

        int count = 0;
        int result = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                result = Math.max(result,count);
            }
            else{
                count = 0;
            }
        }
        return result;
    }
}
