class FindPairsWithGivenSum {
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




// Bruteee approch


class Solution {
    public ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node first = head;
        while (first != null) {
            Node second = first.next;
            while (second != null) {
                if (first.data + second.data == target) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(first.data);
                    pair.add(second.data);
                    ans.add(pair);
                }
                second = second.next;
            }
            first = first.next;
        }
        return ans;
    }
}
