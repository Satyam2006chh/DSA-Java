// brute apprich
public class IntersectionNodeBruteForce {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        while(a!=null){
            ListNode b = headB;
            while(b!=null){
                if(a==b){
                    return a;
                }
                // manlo na eq hua to next se compare krdo
                b = b.next;
            }
            a = a.next;
        }
        return null;
    }
}
