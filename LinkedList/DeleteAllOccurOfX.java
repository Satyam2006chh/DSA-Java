class DeleteAllOccurOfX {
    static Node deleteAllOccurOfX(Node head, int x) {
        // sabse pehle check krunga ki list emptyu to nahi h
        if(head==null){
            return null;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data==x){
                // means temp ka data hi same h x ke 
                if(temp == head){
                    head = head.next;
                }
                if(temp.prev != null){
                    temp.prev.next = temp.next;
                }
                if(temp.next !=  null){
                    temp.next.prev = temp.prev;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
