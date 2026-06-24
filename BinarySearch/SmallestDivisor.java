// smallest divisor with threshold
class SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        // isme starting means low will be from 1 bcoz 1 is the smalest divisor and the sum which will be given whn 1 is taken as the divisor  = largest

        // and we have to take the divisor till the max element inside the arrr
        // suppose max is 5 and u r taking the divsor = 9
        // then after 5 every ans will be 1 so the sum and thw ans will never change so its not the thing we want 

        int low = 1;
        int maxi = 0;
        for(int num : nums){
            if(num > maxi){
                maxi = num;
            }
        }
        int possans = 0;
        int high = maxi;
        while(low <= high){
            int mid = low + (high - low) /2;
            // ab kya krna h low ko lena h and sare elments se divide krna h and make sure to check for the threshold 
            int sum = 0;
            for(int num : nums){
                 sum += (int) Math.ceil((double) num / mid);
            }
            if(sum <= threshold){
                possans = mid;
                // and agar tume sum aur chota chaiye to below is the relation 
                // jaise jaise divisor badta jayega sum decrease hota jayega
                high = mid-1;
            }
            else{
                // means the sum >= threshold
                // and if its greater tha threshold then hume divisor badana hoga 
                // as the divisor increases the sum goes down 
                low = mid + 1;
            }
        }
        return possans;
        
    }
}class SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        // isme starting means low will be from 1 bcoz 1 is the smalest divisor and the sum which will be given whn 1 is taken as the divisor  = largest

        // and we have to take the divisor till the max element inside the arrr
        // suppose max is 5 and u r taking the divsor = 9
        // then after 5 every ans will be 1 so the sum and thw ans will never change so its not the thing we want 

        int low = 1;
        int maxi = 0;
        for(int num : nums){
            if(num > maxi){
                maxi = num;
            }
        }
        int possans = 0;
        int high = maxi;
        while(low <= high){
            int mid = low + (high - low) /2;
            // ab kya krna h low ko lena h and sare elments se divide krna h and make sure to check for the threshold 
            int sum = 0;
            for(int num : nums){
                 sum += (int) Math.ceil((double) num / mid);
            }
            if(sum <= threshold){
                possans = mid;
                // and agar tume sum aur chota chaiye to below is the relation 
                // jaise jaise divisor badta jayega sum decrease hota jayega
                high = mid-1;
            }
            else{
                // means the sum >= threshold
                // and if its greater tha threshold then hume divisor badana hoga 
                // as the divisor increases the sum goes down 
                low = mid + 1;
            }
        }
        return possans;
        
    }
}
Why Binary Search?

Observe:

Divisor	Sum
1	17
2	10
3	7
4	7
5	5
6	5
7	5
Divisor ↑
Sum ↓
