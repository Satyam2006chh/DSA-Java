class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer>list = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
        for(int i= 0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                // means tht day has arrived where the value is higher than all the prev days 
                list.add(i+1);
            }
            else{
                int ans = i - st.peek();
                list.add(ans);
            }
            st.push(i);
        }
        return list;
    }
}
