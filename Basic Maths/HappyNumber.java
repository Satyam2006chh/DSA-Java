class Solution {
    public boolean isHappy(int n) {
        int result = n;
        while(result != 1 && result != 4){
            result = sumofsq(result);
        }
        if(result == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public int sumofsq(int n){
        int sum = 0;
        while(n > 0){
            int last = n % 10;
            sum += last * last;
            n = n / 10;
        }
        return sum;
    }
}
