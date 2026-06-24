class IsPalindromeBruteForce {
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
