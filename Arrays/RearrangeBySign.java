import java.util.Arrays;

public class RearrangeBySign {
    // Optimal: equal positives and negatives
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] ans = new int[arr.length];
        int pos = 0, neg = 1;
        for (int num : arr) {
            if (num > 0) { ans[pos] = num; pos += 2; }
            else { ans[neg] = num; neg += 2; }
        }
        System.out.println(Arrays.toString(ans));
    }
}
