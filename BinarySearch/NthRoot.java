class NthRoot {
    public int nthRoot(int n, int m) {
        // isme basically m is the target
        // means koi number ko agar n bar multiply kre to m aayega ya fir nahii
        if(m <= 0){
            return 0;
        }
        
        int start = 1;
        int end = m;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            long value = 1;
            for(int i = 1; i<=n; i++){
                value = value * mid;
            }
            if(value == m){
                ans = mid;
                return ans;
            }
            else if(value < m){
                // means value choti h and ans bada hai to aage jana pdega ma 
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}
