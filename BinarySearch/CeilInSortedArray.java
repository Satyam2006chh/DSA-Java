// now for the ciel
 
public class CeilInSortedArray {
    public static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // possible ceil
            if(arr[mid] >= target) {
                ans = arr[mid];
                // try finding smaller valid value
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
