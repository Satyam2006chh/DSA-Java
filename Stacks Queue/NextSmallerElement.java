// Next smaller element - optimized /


class NextSmallerElement {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // same logic as the next smaller element bas thoda sa modifications..
        
        ArrayList<Integer>list = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
        int n = arr.length;
        
        for(int i= n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
}
