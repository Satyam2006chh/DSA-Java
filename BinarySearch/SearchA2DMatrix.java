leetcode 74 - 
class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // brute force approch first
        // where we hae to double the loop.

        // for(int i= 0;i<matrix.length; i++){
        //     for(int j =0; j<matrix[0].length; j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;


        // Now the optimized apprioch
        // Here inside the ques there are 2 most important properties - 
        // 1- Every row is sorted
        // 2- Every first integer of thee row is always greater than the last integer of evry row

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while(left <= right){
            int mid = left + (right - left) /2;
            int row = mid / cols;
            int col = mid % cols;

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                // means targ aage hai 
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}
