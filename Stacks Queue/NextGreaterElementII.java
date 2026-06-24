// nge2\
class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st = new Stack<>();
        int n = nums.length;
        int[] arr = new int[n];

        for(int i = 2 *n -1 ; i>=0; i--){
            int indexx = i % n;
            while(!st.isEmpty() && nums[st.peek()] <= nums[indexx]){
                st.pop();
            }
            if(st.isEmpty()){
                // means kuch ni h stack me 
                arr[indexx] = -1;
            }
            else{
                arr[indexx] = nums[st.peek()];
            }
            st.push(indexx);
        }
        return arr;
        
    }
}
