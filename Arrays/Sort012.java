// /sort 012 

// bruite 
public class Sort012 {

    public static void sort012(int[] arr) {

        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        // First Pass -> Counting
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                cnt0++;
            }
            else if (arr[i] == 1) {
                cnt1++;
            }
            else {
                cnt2++;
            }
        }

        // Second Pass -> Filling Array

        int i = 0;

        while (cnt0-- > 0) {
            arr[i++] = 0;
        }

        while (cnt1-- > 0) {
            arr[i++] = 1;
        }

        while (cnt2-- > 0) {
            arr[i++] = 2;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        sort012(arr);

        // Printing Array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


// Main “Problem” In Counting Approach
// It needs 2 passes

// pass1 - count 0 1 2 
// pass2 - refill them inside the arr again



// below is the optimal code 

public class Sort012 {

    public static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            // If element is 0
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            // If element is 1
            else if (arr[mid] == 1) {
                mid++;
            }
            // If element is 2
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1, 0, 2, 1, 0};
        sort012(arr);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
