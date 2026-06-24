class RowWithMaxOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        // first we will be doin the brute force approch 
        // in which the time complex will be o(n*m;)
        // int max1 = -1;
        // int rowswithmax = -1;

        // for(int i= 0; i<mat.length; i++){
        //     int count= 0;
        //     for(int j= 0; j<mat[0].length; j++){
        //         if(mat[i][j] == 1){
        //             count++;
        //         }
        //     }
        //     if(count > max1){
        //         rowswithmax = i;
        //         max1 = count;
        //     }
        // }
        // int[] result = new int[2];
        // result[0] = rowswithmax;
        // result[1] = max1;
        // return result;


        // Now the optmized approch
        // basically the rows are sorted here means 0 and 1 in sorrted way
        // so if we know the firsst pos where the one occurs w can find how many ones are there
        // by doingg - rowsize of that row - first index where the one occurs

        int max1 = -1;
        int rowswithmax = -1;
        for(int i= 0; i<mat.length; i++){
            int firstone = firstOne(mat[i]);
            if(firstone != -1){
                // ab yaha minus krke nikalenge ki kitne one h where firrst one will be giving u the index where the frst 1 occured
                int count = mat[i].length - firstone;
                if(count > max1){
                    max1 = count;
                    rowswithmax = i;
                }
            }
        }
        int[] result = new int[2];
        result[0] = rowswithmax;
        result[1] = max1;
        return result;


    }
    public int firstOne(int[] row){
        int left = 0;
        int right = row.length - 1;
        int count = -1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(row[mid] == 1){
                count = mid;
                right = mid-1;
            }
            else{
                // means zero h wo and if zero then aage dhundo
                left = mid+1;
            }
        }
        return count;
    }
}
