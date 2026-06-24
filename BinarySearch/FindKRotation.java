// COUNT HOW MANY TIMES AN ARRAY HAS BEEN ROATED = MIN ELEMENT KA INDEX


public class FindKRotation {

    // Minimum find karne wala function
    public static int findMin(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            // AGAR SORTED HAI
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            // LEFT SORTED
            if (arr[low] <= arr[mid]) {

                ans = Math.min(ans, arr[low]);

                low = mid + 1;
            }

            // RIGHT SORTED
            else {

                ans = Math.min(ans, arr[mid]);

                high = mid - 1;
            }
        }

        return ans;
    }

    // Rotation count
    public static int countRotations(int[] arr) {

        int min = findMin(arr);

        // Minimum ka index find karo
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == min) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,1,2,3};

        System.out.println("Rotations = " + countRotations(arr));
    }
}
