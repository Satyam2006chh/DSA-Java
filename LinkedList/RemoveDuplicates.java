class RemoveDuplicates {
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
