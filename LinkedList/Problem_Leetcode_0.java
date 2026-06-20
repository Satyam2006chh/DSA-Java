class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
        
    }
}


public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean iscycle = false;
        // mean man ke chlo ni h cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                iscycle = true;
                break;
            }
        }
        if(!iscycle){
            return null;
        }
        fast = head;
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}


class Solution {
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

class Solution {
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


class Solution {
    public boolean isPalindrome(ListNode head) {
        // isme brute force me hum stack use krenge /
        // stack follows the lifo so that when we use the staack we will be taking elemntfrom top and then we will be comparing to see what is happening and all

        if(head==null){
            return true;
        }
        Stack<Integer>st = new Stack<>();
        // pehle sare element stack ke andar daldo
        ListNode temp = head;
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        // aise krke sarre elements humne stack me daldiye h
        // ab hum kya krenge ki ek ek krke elemn nikalenge stack se 
        // and compare krte jayenge 
        temp = head;
        while(temp != null){
            int topelement = st.pop();
            if(topelement != temp.val){
                return false;
            }
            temp = temp.next;
        }
        return true;

    }
}


// optimized apprich

class Solution {
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



// brute
class Solution {
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



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow  = dummy;
        ListNode fast  = dummy;

        for(int i= 0; i<=n; i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}


// vvvvvvvvvvvvvvvvvvvvviiiiiiiiiiiiipppppppppppppp
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // yaha why we including the carryy != 0 in loop condition bcoz
        // manlo 2list h and dono me sirf ek ek elem h
        // ab manlo add kra tumne and 0 is the new list elementnode
        // and carry = 1;
        // agar carry add ni kroge to l11=null || l2!=null will bcome false || false
        // so loop endds and it returns only 0 but it was suppose to return 0 and then 1
        // thts why we added here carry 
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while(l1 != null || l2!=null || carry !=0){
            // we r not using th && here bcoz we need tht jbtk ek bhi conditon true h chlta jaye loop
            // jaise hi sari false ho tb ruke loop
            // and hume jab rukna h jab sari link list means dono empty hojaye

            int sum = carry;
            // sum = carry isliye liya taki jab carry = 1 ho to next sum me wo add hota jaye .
            // alag se kahi store na krna pde.
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            // jab sum hogaya poora cal
            // ab carryy lo sabse pehle to
            carry = sum / 10;
            // ab new node bana and current ke aage lagado use 
            ListNode newnode = new ListNode(sum%10);
            current.next = newnode;
            current = current.next;
        }
        return dummy.next;

    }
}



brute force for segregating tthe od and the even nodes in the linked list
class Solution {
    public ListNode oddEvenList(ListNode head) {
        //isme basically hum ek arraylist banayenge 
        // odd pos ke element ko pehle store krlo ek bari me and then even node ke elem ko 
        // after that again traverse in list and then make the values change acc to it 

        ArrayList<Integer>list = new ArrayList<>();
        ListNode temp = head;
        int pos = 1;
        while(temp != null){
            if(pos % 2 != 0){
                list.add(temp.val);
                // jaise hi val add krdii ab bhar if se 
            }
            temp = temp.next;
            pos++;
        }
        // jais hi ye wali while loop end hogi list me sare odd indecx ke element aajayenge
        // and then ab hum kya krenge ki even wale bharenge odd ke bad
        temp = head;
        pos = 1;
        while(temp != null){
            if(pos % 2 == 0){
                list.add(temp.val);
            }
            temp =temp.next;
            pos++;
        }   
        // ab sab aagaye h list me odd + even 
        // ab hume kya krna  h ki list me se element uthakar wapas ll me replace marne h
        temp = head;
        int i = 0;
        while(temp != null){
            temp.val= list.get(i);
            temp = temp.next;
            i++;
        }
        return head;
    }
}


// optimized approch 

class Solution {
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



// LEETCODE 3467
class Solution {
    public int[] transformArray(int[] nums) {
        int zerocount= 0;
        int countone = 0;
        for(int i= 0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
                zerocount++;
            }
            else{
                nums[i] = 1;
                countone++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(i<zerocount){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        return nums;
        // usinng the arrays .sort() willtake  more space comp - O(logn) OR o(N);
    }
}



// brute apprich
public class Solution {
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


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }
}


public class Solution {
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

// optmized approch 

public class Solution {
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





class Solution {

    public ListNode sortList(ListNode head) {

        // Base Case
        if (head == null || head.next == null) {
            return head;
        }

        // Find Middle
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the list
        ListNode right = slow.next;
        slow.next = null;

        // Recursively sort both halves
        ListNode left = sortList(head);
        right = sortList(right);

        // Merge sorted halves
        return merge(left, right);
    }

    private ListNode merge(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        }

        if (l2 != null) {
            curr.next = l2;
        }

        return dummy.next;
    }
}




class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and tail
        ListNode tail = head;
        int length = 1;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Normalize k
        k = k % length;

        if (k == 0) {
            return head;
        }

        // Make circular linked list
        tail.next = head;

        // Find new tail
        int pos = length - k;
        ListNode newTail = head;

        for (int i = 1; i < pos; i++) {
            newTail = newTail.next;
        }

        // New head
        ListNode newHead = newTail.next;

        // Break the circle
        newTail.next = null;

        return newHead;
    }
}



class Solution {
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



class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(head == null) return ans;

        Node left = head;
        Node right = head;

        // find tail
        while(right.next != null)
        {
            right = right.next;
        }

        while(left != right && right.next != left)
        {
            int sum = left.data + right.data;

            if(sum == target)
            {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);

                ans.add(pair);

                left = left.next;
                right = right.prev;
            }
            else if(sum < target)
            {
                left = left.next;
            }
            else
            {
                right = right.prev;
            }
        }

        return ans;
    }
}



class Solution {
    Node removeDuplicates(Node head) {

        Node curr = head;

        while(curr != null && curr.next != null)
        {
            if(curr.data == curr.next.data)
            {
                Node duplicate = curr.next;

                curr.next = duplicate.next;

                if(duplicate.next != null)
                {
                    duplicate.next.prev = curr;
                }
            }
            else
            {
                curr = curr.next;
            }
        }

        return head;
    }
}
