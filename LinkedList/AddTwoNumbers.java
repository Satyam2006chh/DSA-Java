// vvvvvvvvvvvvvvvvvvvvviiiiiiiiiiiiipppppppppppppp
class AddTwoNumbers {
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
