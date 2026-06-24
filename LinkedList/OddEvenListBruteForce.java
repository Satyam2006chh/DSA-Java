brute force for segregating tthe od and the even nodes in the linked list
class OddEvenListBruteForce {
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
