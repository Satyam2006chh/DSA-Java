class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return  head;
    }
}



// brute approch - 

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // If there is only one node
        if (head == null || head.next == null) {
            return null;
        }
        // Count total nodes
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        // Find middle index
        int middle = count / 2;
        temp = head;
        // Move to the node before the middle node
        for (int i = 1; i < middle; i++) {
            temp = temp.next;
        }

        // Delete middle node
        temp.next = temp.next.next;
        return head;
    }
}
