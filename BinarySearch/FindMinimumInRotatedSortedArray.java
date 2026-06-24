// CEHCK FOR THE MIN IN ROTATED SORTED ARR


public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            // AGAR PURA PART SORTED HAI
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            // LEFT HALF SORTED HAI
            if (arr[low] <= arr[mid]) {

                ans = Math.min(ans, arr[low]);

                // RIGHT SIDE JAO
                low = mid + 1;

            } else {

                // RIGHT HALF SORTED HAI
                ans = Math.min(ans, arr[mid]);

                // LEFT SIDE JAO
                high = mid - 1;
            }
        }

        return ans;
    }
}
