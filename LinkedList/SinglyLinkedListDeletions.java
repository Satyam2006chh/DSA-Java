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
