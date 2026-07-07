public class CountSubarraysWithSumK {
    // O(n^2)
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2};
        int k = 3, count = 0;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == k) count++;
            }
        }
        System.out.println(count);
    }
}
