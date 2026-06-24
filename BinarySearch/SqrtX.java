// sqrt x

class SqrtX {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        if(x==1){
            return 1;
        }

        int left = 0;
        int high = x;
        int ans = 0;

        while(left <= high){
            int mid = left + (high - left)/2;
            long sq = (long) mid * mid;

            if(sq == x){
                ans = mid;
                return ans;
            }

            else if(sq < x){
                ans = mid;
                left = mid+1;
            }
            else{
                high= mid-1;
            }
        }
        return ans;
        
    }
}
