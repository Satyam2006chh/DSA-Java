// doubly link list - 
// same as the single link list but slight difference isin there 
// har node ke paas yaha prev next data hota h 
// waha single me sirf next ka store hotta tha inside the node 



// Doubly Linked List
// Har node ke paas data, previous node ka reference
// aur next node ka reference hota hai

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList{

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
            return newnode;
        }

        newnode.next = head;
        head.prev = newnode;

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
        newnode.prev = temp;

        return head;
    }

    public static Node insertAtPosition(Node head, int data, int pos){

        Node newnode = new Node(data);

        if(pos == 1){

            newnode.next = head;

            if(head != null){
                head.prev = newnode;
            }

            return newnode;
        }

        Node temp = head;

        for(int i = 1; i < pos - 1; i++){
            temp = temp.next;
        }

        newnode.next = temp.next;
        newnode.prev = temp;

        if(temp.next != null){
            temp.next.prev = newnode;
        }

        temp.next = newnode;

        return head;
    }

    public static void main(String[] args){

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linking

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        // Print Original List

        printlist(head);

        // Insert At Head

        head = inserthead(head, 0);
        printlist(head);

        // Insert At Tail

        head = inserttail(head, 40);
        printlist(head);

        // Insert At Position

        head = insertAtPosition(head, 25, 4);
        printlist(head);
    }
}
