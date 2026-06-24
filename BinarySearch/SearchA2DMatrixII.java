class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        // isme briute force y h ki manual 2 loops chalao one for row and one for col
        // and check kro ki is elem  present or not ?

        // Optmized approrch - 

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        while(row < rows && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
        
    }
}
