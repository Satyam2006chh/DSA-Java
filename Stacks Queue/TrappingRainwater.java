class Solution {
    public int maxWater(int arr[]) {
        // here i will bhe trying the brute force approch 
        // in which what will be doin is that 
        // we will be calculating the leftmax and the rightmax for each building
        // and we will be taking the each index one time .
        
        int n = arr.length;
        int wwater = 0;
        for(int i= 0; i<arr.length; i++){
            int leftmax = arr[i];
            for(int j=  0; j<=i; j++){
                leftmax =  Math.max(leftmax,arr[j]);
            }
            int rightmax = arr[i];
            for(int j= i; j<n; j++){
                rightmax = Math.max(rightmax, arr[j]);
            }
            wwater += Math.min(leftmax,rightmax) - arr[i];
        }
        return wwater;
    }
}


Optmized approch 


class Solution {
    public int trap(int[] height) {

        int n = height.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // Build left array
        left[0] = height[0];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // Build right array
        right[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        int water = 0;

        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - height[i];
        }

        return water;
    }
}
