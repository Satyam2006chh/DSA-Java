// optmized approch 

public class SortListOptimized {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Dummy nodes
        ListNode zeroD = new ListNode(-1);
        ListNode oneD = new ListNode(-1);
        ListNode twoD = new ListNode(-1);

        // Tail pointers
        ListNode zero = zeroD, one = oneD, two = twoD;

        // Traverse and distribute nodes
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.val == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        // Connect lists without ternary
        if (oneD.next != null) {
            zero.next = oneD.next;
        } else {
            zero.next = twoD.next;
        }

        one.next = twoD.next;
        two.next = null;

        // New head
        return zeroD.next;
    }
}
