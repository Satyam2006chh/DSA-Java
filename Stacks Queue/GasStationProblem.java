class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // first we will b solving this question with the help of the brute force approch 
        // in the bf approch what will be doin is that - 
        // we will take each station and thn for very station we wull b checking if its the ans or not   ? 
        // Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]

        int n = gas.length;
        for(int i= 0; i<n; i++){
            int current = i;
            int count = 0;
            // current stores the particular station 
            int tank = 0;
            // to store the gas inside the tank 
            // int count = 0;
            // jo bhi answer hoga uske liye count will be equal to n
            // count == n.
            // A station will be marked as th posssible ans if it covers the full circle
            while(count < n){
                tank += gas[current];
                tank -= cost[current];
                if(tank < 0){
                    break;
                }
                current = (current + 1)% n;
                count ++;
            }
            if(count == n){
                return i;
            }
        }
        return -1;
    }
}
