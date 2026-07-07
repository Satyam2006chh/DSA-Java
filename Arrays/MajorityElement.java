public class MajorityElement {
    // Moore Voting Algorithm - O(n) time, O(1) space
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int candidate = 0, count = 0;
        for (int num : arr) {
            if (count == 0) { candidate = num; count = 1; }
            else if (num == candidate) count++;
            else count--;
        }
        int freq = 0;
        for (int num : arr) if (num == candidate) freq++;
        if (freq > arr.length / 2) System.out.println("Majority Element: " + candidate);
        else System.out.println("No Majority Element");
    }
}
