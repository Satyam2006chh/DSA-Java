class MinStack {
    // The explanation and the logic of the ques is that  - 
    // normal stack can do push pop del and all in O(1);
    // if we say stakc to give top it will immed give bcoz the top elem is always avail  - O(1);
    // but what is we say hey stack give me the min elem 
    // a normal approc will search all elem to find the min and then the tc will - O(n);
    // But we want this tc to be O(1);
    Stack<Integer>st;
    Stack<Integer>minstore;

    public MinStack() {
        st = new Stack<>();
        minstore = new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(minstore.isEmpty()){
            minstore.push(value);
        }
        else{
            minstore.push(Math.min(value, minstore.peek()));
        }
    }
    
    public void pop() {
        // pop krne se pehhle check kro emptuy to nai h 
        if(st.isEmpty()){
            return;
        }
        st.pop();
        minstore.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minstore.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
