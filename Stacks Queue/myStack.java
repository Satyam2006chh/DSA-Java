class myStack {
    private int[] arr;   // array to store stack elements
    private int top;     // index of the top element
    private int capacity; // maximum size of the stack

    // Constructor
    public myStack(int n) {
        capacity = n;
        arr = new int[n];
        top = -1; // stack is initially empty
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Push element onto stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = x;
    }

    // Pop element from stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return;
        }
        top--;
    }

    // Peek at the top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1; // or throw exception
        }
        return arr[top];
    }
}


// 2 variation  wit concept

class StackArray {

    int[] arr;
    int top;
    int capacity;

    StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int data) {

        if(top == capacity - 1) {
            System.out.println("Overflow");
            return;
        }

        arr[++top] = data;
    }

    int pop() {

        if(top == -1) {
            System.out.println("Underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek() {

        if(top == -1)
            return -1;

        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }
}


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;
    int size;

    Stack() {
        top = null;
        size = 0;
    }

    // Push
    public void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        size++;
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;

        size--;
        return value;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // Size
    public int size() {
        return size;
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}



class Solution {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        for(int i= 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch =='[' || ch == '{'){
                // means agar opening bracket h to une stack me daldo
                st.push(ch);
            }
            else{
                // yaha aaate h 2 cases 
                // 1 - ya to opening aaya hi nahi seedha closing aaay - stack empty hoga us case me 
                if(st.isEmpty()){
                    return false;
                }
                // means opening aaya h ab par jp char h wo opening nahi h
                char attop = st.peek();
                if((attop == '(' && ch == ')') || (attop == '[' && ch == ']') || (attop == '{' && ch == '}')){
                    st.pop();
                }
                else{
                    // means clsoing bhi nahi h lekin kuch aur h 
                    return false;
                }
                
            }
        }
        return st.isEmpty();
    }
}




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


// 3612. Process String with Special Operations I
class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                // Append lowercase letters
                result.append(ch);
            } else if (ch == '*') {
                // Remove last character if exists
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else if (ch == '#') {
                // Duplicate current result
                result.append(result.toString());
            } else if (ch == '%') {
                // Reverse current result
                result.reverse();
            }
        }

        return result.toString();
    }
}





// 2960. Count Tested Devices After Test Operations\
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int tested = 0;
        int n = batteryPercentages.length;

        for (int i = 0; i < n; i++) {
            if (batteryPercentages[i] > 0) {
                // Device i is tested
                tested++;

                // Decrease battery of all devices after i
                for (int j = i + 1; j < n; j++) {
                    if (batteryPercentages[j] > 0) {
                        batteryPercentages[j]--;
                    }
                }
            }
        }

        return tested;
    }
}
