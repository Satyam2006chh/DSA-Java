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
