// // Circular link list - 
// yaha last node ka next dont points to the null it again points to the head
// of the link list 

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList{

    public static void printList(Node head){

        if(head == null){
            return;
        }

        Node temp = head;

        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != head);

        System.out.println();
    }

    public static Node insertHead(Node head, int data){

        Node newNode = new Node(data);

        if(head == null){
            newNode.next = newNode;
            return newNode;
        }

        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;

        head = newNode;

        return head;
    }

    public static Node insertTail(Node head, int data){

        Node newNode = new Node(data);

        if(head == null){
            newNode.next = newNode;
            return newNode;
        }

        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;

        return head;
    }

    public static Node insertAtPosition(Node head, int data, int pos){

        if(pos == 1){
            return insertHead(head, data);
        }

        Node newNode = new Node(data);

        Node temp = head;

        for(int i = 1; i < pos - 1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static Node deleteHead(Node head){

        if(head == null){
            return null;
        }

        if(head.next == head){
            return null;
        }

        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }

        temp.next = head.next;

        head = head.next;

        return head;
    }

    public static Node deleteTail(Node head){

        if(head == null){
            return null;
        }

        if(head.next == head){
            return null;
        }

        Node temp = head;

        while(temp.next.next != head){
            temp = temp.next;
        }

        temp.next = head;

        return head;
    }

    public static Node deleteAtPosition(Node head, int pos){

        if(pos == 1){
            return deleteHead(head);
        }

        Node temp = head;

        for(int i = 1; i < pos - 1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args){

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        third.next = head;

        System.out.println("Original List");
        printList(head);

        head = insertHead(head, 5);
        System.out.println("After Insert Head");
        printList(head);

        head = insertTail(head, 40);
        System.out.println("After Insert Tail");
        printList(head);

        head = insertAtPosition(head, 25, 4);
        System.out.println("After Insert Position");
        printList(head);

        head = deleteHead(head);
        System.out.println("After Delete Head");
        printList(head);

        head = deleteTail(head);
        System.out.println("After Delete Tail");
        printList(head);

        head = deleteAtPosition(head, 3);
        System.out.println("After Delete Position");
        printList(head);
    }
}
