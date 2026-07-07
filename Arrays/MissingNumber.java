public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4};
        int n = 4;
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i <= n; i++) xor1 ^= i;
        for (int num : arr) xor2 ^= num;
        System.out.println("Missing Number = " + (xor1 ^ xor2));
    }
}
