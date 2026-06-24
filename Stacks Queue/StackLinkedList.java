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
