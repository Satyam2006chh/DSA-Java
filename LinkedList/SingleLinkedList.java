// Single link list
// har node ke pas yaha data and next node ka reference hota hai

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList{

    public static void printlist(Node head){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println();
    }

    public static Node inserthead(Node head, int data){

        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return head;
        }

        newnode.next = head;
        head = newnode;

        return head;
    }

    public static Node inserttail(Node head, int data){

        Node newnode = new Node(data);

        if(head == null){
            return newnode;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newnode;

        return head;
    }

    public static Node insertAtPosition(Node head, int data, int pos){

        Node newNode = new Node(data);

        if(pos == 1){
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        for(int i = 1; i < pos - 1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static void main(String[] args){

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        third.next = null;

        // printing the linked list
        printlist(head);

        // insert at head
        Node newhead = inserthead(head, 0);
        printlist(newhead);

        // insert at tail
        newhead = inserttail(newhead, 40);
        printlist(newhead);

        // insert at position
        newhead = insertAtPosition(newhead, 25, 4);
        printlist(newhead);
    }
}
