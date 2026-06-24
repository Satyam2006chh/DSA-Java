median of 2 sort arrays 

class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // brute force approch 
        // for the same size sorted arrays 
        int[] merged = new int[nums1.length + nums2.length];
        int i= 0;
        int j= 0; 
        int k= 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                // means i chota h and j bada h 
                merged[k++] = nums1[i++];
            }
            else{
                merged[k++] = nums2[j++];
            }
        }

        // ab merged me sare elements aaagaye h for the safety check we will be itersting over the while loop again so that the arrays remain empty and merged will be filled with all the elements inside the arrays 

        while(i<nums1.length){
            merged[k++] = nums1[i++];
        }
        while(j<nums2.length){
            merged[k++] = nums2[j++];
        }

        if(merged.length %2 == 0){
            // means its a evwe sized array 
            return (merged[merged.length/2] + merged[(merged.length/2)-1]) / 2.0;
        }
        else{
            return (merged[merged.length/2]);
        }
    }
}
