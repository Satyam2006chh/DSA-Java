public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4};
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                arr[index + 1] = arr[i];
                index++;
            }
        }
        for (int i = 0; i <= index; i++) System.out.println(arr[i]);
    }
}
