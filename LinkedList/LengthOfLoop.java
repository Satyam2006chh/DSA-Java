class LengthOfLoop {
    public int lengthOfLoop(Node head) {
        // length of loop jab nikal paoge jab link list mee cycle hogi 
        // to first check kro cycle h ya ni 
        // if cycl then length deko
        if(head==null){
            return 0;
        }
        boolean iscycle = false;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                iscycle  = true;
                break;
            }
        }
        if(!iscycle){
            return 0;
        }
        Node current= fast;
        int count = 1;
        while(current.next != fast){
            current = current.next;
            count++;
        }
        return count;
    }
}
