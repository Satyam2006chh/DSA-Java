import java.util.Arrays;

public class TwoSum {
    // Optimal: Two Pointer (array must be sorted)
    public static void main(String[] args) {
        int[] arr = {7, 2, 11, 15};
        int target = 9;
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) { System.out.println(arr[left] + " " + arr[right]); return; }
            else if (sum < target) left++;
            else right--;
        }
        System.out.println("No Pair Found");
    }
}
