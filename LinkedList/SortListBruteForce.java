public class SortListBruteForce {
    public void sortList(ListNode head) {
        int count0 = 0, count1 = 0, count2 = 0;
        ListNode temp = head;

        // Step 1: Count occurrences of 0s, 1s, and 2s
        while (temp != null) {
            if (temp.val == 0) count0++;
            else if (temp.val == 1) count1++;
            else count2++;
            temp = temp.next;
        }

        // Step 2: Rewrite values in sorted order
        temp = head;
        while (temp != null) {
            if (count0 > 0) {
                temp.val = 0;
                count0--;
            } else if (count1 > 0) {
                temp.val = 1;
                count1--;
            } else {
                temp.val = 2;
                count2--;
            }
            temp = temp.next;
        }
    }
}
