public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 0, 4, 0, 5, 0, 6};
        int firstzero = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) { firstzero = i; break; }
        }
        if (firstzero == -1) return;
        for (int i = firstzero + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i]; arr[i] = arr[firstzero]; arr[firstzero] = temp;
                firstzero++;
            }
        }
        for (int num : arr) System.out.print(num + " ");
    }
}
