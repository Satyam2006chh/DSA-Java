// optimized approch 

class OddEvenListOptimized {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next ==null){
            return head;
        }
        // brute me extra space use hori thi and it was the arraylist
        // now in the optmized approach - 
        ListNode odd = head;
        ListNode even =  head.next;
        ListNode evenhead = even;
        while(even != null && even.next != null){
            // hum yaha even.next krre h pehle means main kaam eve.next ka hi h 
            // agar even hi null hua to sb crash
            // to while me hume even ka dhyan rakhna h ki wo null na hojaye.
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        // ab sab hogaya means odd and even sepeerate hogaye
        // now we only have to connect them
        odd.next = evenhead;
        return head;
    }
}
