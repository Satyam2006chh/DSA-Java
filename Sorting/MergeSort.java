import java.util.Arrays;

public class MergeSort {

    static int[] mergeSort(int[] arr) {

        // BASE CASE
        // Agar array me sirf 1 element hai
        // to vo already sorted hai
        if (arr.length == 1) {
            return arr;
        }

        // Middle nikalna
        int mid = arr.length / 2;

        // Left half banana
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));

        // Right half banana
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Dono sorted arrays ko merge karna
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {

        // Final merged array
        int[] mix = new int[first.length + second.length];

        // Pointers
        int i = 0; // first array
        int j = 0; // second array
        int k = 0; // mix array

        // Dono arrays compare karo
        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }

            k++;
        }

        // Agar first array me elements bach gaye
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Agar second array me elements bach gaye
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 5, 2, 8};

        int[] ans = mergeSort(arr);

        System.out.println(Arrays.toString(ans));
    }
}
