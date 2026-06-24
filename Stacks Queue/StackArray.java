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
