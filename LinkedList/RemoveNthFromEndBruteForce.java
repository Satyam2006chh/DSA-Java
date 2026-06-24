// brute
class RemoveNthFromEndBruteForce {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode temp = head;

        while(temp != null){
            length++;
            temp = temp.next;
        }

        int pos = length - n + 1;

        // delete head
        if(pos == 1){
            return head.next;
        }

        temp = head;

        for(int i=0; i<pos-2; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
