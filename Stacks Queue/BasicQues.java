// Reverse a string using a stack 

class Solution {
    public String reverse(String S) {
        String reversed = "";
        Stack<Character>st = new Stack<>();
        for(int i= 0; i<S.length(); i++){
            char ch = S.charAt(i);
            st.push(ch);
        }
        while(!st.isEmpty()){
            reversed += st.pop();
        }
        return reversed;
    }
}

// reveerse a queue

class Solution {
    public void reverseQueue(Queue<Integer> q) {
        Stack<Integer>st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        System.out.println(q);
    }
}

// reverse first K

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int orignal_size = q.size();
        Stack<Integer>st  = new Stack<>();
        for(int i= 0; i<k; i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        int rem = orignal_size - k;
        for(int i= 0; i<rem; i++){
            q.offer(q.poll());
        }
        return q;
    }
}
