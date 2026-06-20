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

public class Node{

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

public class Node{

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

// insertions inside the double link list 
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

public class Node{

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

// deletions inside the singl link list 
public static Node deleteHead(Node head){

    if(head == null){
        return null;
    }

    return head.next;
}

public static Node deleteTail(Node head){
    if(head == null){
        return null;
    }
    if(head.next == null){
        return null;
    }
    Node temp = head;
    while(temp.next.next != null){
        temp = temp.next;
    }
    temp.next = null;
    return head;
}

public static Node deleteAtPosition(Node head, int pos){
    if(head == null){
        return null;
    }
    if(pos == 1){
        return head.next;
    }
    Node temp = head;
    for(int i = 1; i < pos - 1; i++){
        temp = temp.next;
    }
    temp.next = temp.next.next;
    return head;
}


// deletions in the double link list 

public static Node deleteHead(Node head){
    if(head == null){
        return null;
    }
    if(head.next == null){
        return null;
    }
    head = head.next;
    head.prev = null;
    return head;
}

public static Node deleteTail(Node head){
    if(head == null){
        return null;
    }
    if(head.next == null){
        return null;
    }
    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.prev.next = null;
    return head;
}


public static Node deleteAtPosition(Node head, int pos){
    if(head == null){
        return null;
    }
    if(pos == 1){
        return deleteHead(head);A
    }
    Node temp = head;
    for(int i = 1; i < pos; i++){
        temp = temp.next;
    }
    if(temp.next == null){
        temp.prev.next = null;
        return head;
    }
    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;
    return head;
}






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

public class Node{

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
