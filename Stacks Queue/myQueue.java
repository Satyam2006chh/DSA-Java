class myQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    public myQueue(int n) {
        size = n;
        arr = new int[size];
        front= 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int x) {
        if(isFull()){
            return;
        }
        rear++;
        arr[rear] = x;
    }

    public void dequeue() {
        if(isEmpty()){
            return;
        }
        front++;
    }

    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
}






class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class MyQueue {

    Node front;
    Node rear;

    MyQueue(){
        front = null;
        rear = null;
    }

    // Enqueue
    void enqueue(int x){

        Node newNode = new Node(x);

        if(front == null){
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue
    int dequeue(){

        if(front == null){
            return -1;
        }

        int removed = front.data;

        front = front.next;

        if(front == null){
            rear = null;
        }

        return removed;
    }

    int getFront(){

        if(front == null){
            return -1;
        }

        return front.data;
    }

    int getRear(){

        if(rear == null){
            return -1;
        }

        return rear.data;
    }

    boolean isEmpty(){
        return front == null;
    }
}



// next greater element  - bruete and optmized

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int size = arr.length;
        ArrayList<Integer>list = new ArrayList<>(size);
        for(int i= 0; i<size; i++){
            int maxelement = -1;
            for(int j= i+1; j<size; j++){
                if(arr[j] > arr[i]){
                    maxelement = arr[j];
                    break;
                }
            }
            list.add(maxelement);
        }
        return list;
    }
}


class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer>list = new ArrayList<>(n);
        Stack<Integer>st = new Stack<>();
        for(int i= n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                // means arr[i] jo aara hai wo top se agar bada ho
                // to usko remove krdo and top me arr[i] daldo
                st.pop();
            }
            if(st.isEmpty()){
                // means agar stack khali h iska matlab ye h ki - next greater element h hi nahi abhi ke liye koi bhi
                list.add(-1);
            }
            else{
                list.add(st.peek());
            }
            st.push(arr[i]);
            
        }
        Collections.reverse(list);
        // why we are doing collections.reverse() bcoz jab tum operations krre ho ques me
        // likee - jab tum add krre ho elements oinside the arraylist to waha kya hora h ki wo first index prm insert hue jare h elements inside the list
        // but u r travelling from th right to left so ans right me se fill hone start hone chaiye naki left me se so us cheez ka dhuan  rakhna ya to colections .reverse krdena 
        // ya fir tum list me pehle sare 0 add krdena and then fir .set ka method use krkr add krte jana
        return list;
        
    }
}


// Next smaller element - optimized /


class Solution {
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


// nge2\
class Solution {
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
