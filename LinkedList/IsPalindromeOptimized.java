// optimized apprich

class IsPalindromeOptimized {
    public boolean isPalindrome(ListNode head) {
        // Now the optimized approch 
        // isme basically kya approch rahegi ki isme pehle mid dhoondna h and then second half dhundo and revrse krdo second half ko in order to make it best 
        if(head==null){
            return true;
        }
        if(head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondhalfhead = reverse(slow);
        ListNode temp =head;
        while(secondhalfhead != null){
            if(temp.val != secondhalfhead.val){
                return false;
            }
            temp = temp.next;
            secondhalfhead = secondhalfhead.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        if(head==null){
            return null;
        }
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            next = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
