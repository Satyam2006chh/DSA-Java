class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // brute
        ArrayList<Integer>list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            if(list.contains((nums[i]))){
                continue;
            }
            int count = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/ 3){
                list.add(nums[i]);
            }
        }
        return list;


        // better
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                // means sthat elemeneet is already present inside the map and if its already present then increase its freq
                map.put(num , map.get(num)+1);
            }
            else{
                // means the element is not present inside the map and if its  not presnt then put it in map
                map.put(num,1);
            }
        }
        List<Integer>list = new ArrayList<>();
        for(int key : map.keySet()){
            if(list.contains(key)){
                continue;
            }
            if(map.get(key) > nums.length / 3){
                list.add(key);
            } 
        }
        return list;


        // optimal
        int cand1 = 0;
        int count1 = 0;
        int cand2 = 0;
        int count2 = 0;
        for(int num : nums){
            if(count1 == 0  && num != cand2){
                cand1 = num;
                count1 = 1;
            }
            else if(count2 == 0 && num != cand1) {
                cand2 = num;
                count2 = 1;
            }
            else if(num == cand1){
                count1++;
            }
            else if(num == cand2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        List<Integer>list = new ArrayList<>();
        for(int x : nums){
            if(x == cand1){
                count1++;
            }
            else if(x == cand2){
                count2++;
            }
        }
        if(count1 > nums.length / 3){
            list.add(cand1);
        }
        if(count2 > nums.length / 3){
            list.add(cand2);
        }
        return list;
    }
}
