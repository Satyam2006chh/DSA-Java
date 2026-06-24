// Find Kth Distinct Element Using HashMap

// arr = {1,2,2,3,4,4,5}
// k = 2

// 1,3,5 - distinct elements 
// for k  = 2 ans = 3

public class FindKthDistinctElement{
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5};
        int k = 2;
        int count = 0;
        
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int nums : arr){
            if(!map.containsKey(nums)){
                map.put(nums, 1);
            }
            else{
                map.put(nums, map.get(nums)+1);
            }
        }
        // Now we have stored freq now check for the distinct 
        
        for(int nums  : arr){
            if(map.get(nums) == 1){
                count++;
                if(count == k){
                    System.out.println(nums);
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
}
