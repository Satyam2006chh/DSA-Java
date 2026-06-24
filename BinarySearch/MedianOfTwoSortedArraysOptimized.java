// optmized apprcih 
class MedianOfTwoSortedArraysOptimized {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;

        int i = 0;
        int j = 0;

        int prev = 0;
        int curr = 0;

        for (int k = 0; k <= n / 2; k++) {

            prev = curr;

            if (i < nums1.length && j < nums2.length) {

                if (nums1[i] < nums2[j]) {
                    curr = nums1[i];
                    i++;
                } else {
                    curr = nums2[j];
                    j++;
                }

            } else if (i < nums1.length) {

                curr = nums1[i];
                i++;

            } else {

                curr = nums2[j];
                j++;

            }
        }

        if (n % 2 == 0) {
            return (prev + curr) / 2.0;
        }

        return curr;
    }
}
