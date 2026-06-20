class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //    m is the number of the elements inside the nums 1
        // n is the number of the elements inside the nums 2

        // the final sorted arr should not be returned by the function 
        // instead nums 1 me hi answer dena h bcoz size of the nums1 is already m + n

        int i = m-1;
        int j = n-1;

        int idx = m + n -1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                // means nums1 ka last element is bada then the nums 2 ka last element 
                // means nums1 ka element ayega at the idx 
                nums1[idx] = nums1[i];
                idx--;
                i--;
            }
            else{
                // means nums2 ka last element is greater than the nums1 ka last element 
                // so nums 2 ka elememt aaayegaa at the last of the nums 1.
                nums1[idx] = nums2[j];
                idx--;
                j--;
            }
        }
        // agar kahi bar kya hota h 2md arr ke elements nahi bhar pate instd 1st array ke bhar jate h so for replacing them we have to do another loop 

        // aur agar 2 arr ke nahi bhar paaye inside the fist means first ke sar elem bade the 2 se  and wo apni sahi jagah par  aagaye hai but 2nd aray ke nahi aaa paye soo - 

        while(j>=0){
            nums1[idx] = nums2[j];
            idx--;
            j--;
        }
    }
}
