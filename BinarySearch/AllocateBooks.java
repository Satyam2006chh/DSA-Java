class AllocateBooks {
    public boolean isvalid(int[] arr, int total_books, int k, int mid){
        // k = number of the students.
        // agar koi arrr[i] aisa hua joki mid se hi bada hogaya to waise hi nahi kr paoge aap allocate to usme to kr hi do return false;
        
        int student = 1;
        int pages = 0;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] > mid){
                return false;
                // arr = [2,1,3,10]
                // mid = 5
                // U can take this exampleee
            }
            if(pages + arr[i] <= mid){
                pages += arr[i];
            }
            else{
                // means pages ka sum jada hogaya hai ek mid se 
                student++;
                pages = arr[i];
            }
        }
        // ye false jab dga jab ya to studnts hi greater than k hojaye 
        if(student > k){
            return false;
        }
        else{
            return true;
        }
    }
    public int findPages(int[] arr, int k) {
        // here the total number of the books are basically the length of the array 
        int total_books = arr.length;
        // here the k are the no of the students 
        
        // if the no of the students arer more then the no pf the books  then it will not be  able to distributr thr books among them
        if(k > total_books){
            return -1;
        }
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        // here sum is basically the max no of the books which can be allocated to the students 
        // the minimun no of the books which can be allocated  = 0;
        int start = 0;
        int end = sum;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(isvalid(arr, total_books, k, mid)){
                ans = mid;
                end = mid-1;
                
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
        
    }
}
