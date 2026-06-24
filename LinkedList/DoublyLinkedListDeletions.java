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
