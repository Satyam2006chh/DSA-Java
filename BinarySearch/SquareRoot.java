// Find square root of a number

public class SquareRoot{
    public static void main(String[] args){
        int start = 0;
        int target = 25;
        int end = target;
        int ans = 0;
        
        while(start <= end){
            int mid  = start + (end-start)/2;
            long square = (long) mid * mid;
            if(square == target){
                ans = mid;
                return ans;
            }
            else if(square < target){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
};
