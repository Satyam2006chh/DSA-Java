class Solution {
    public int lengthOfLongestSubstring(String s) {
        // brute force me hum kya krenge ki every sustring calc krenge and har ek substring check krenge according tto the condition bas optmizeed and brute me yehi similarity rhegi ki dono me hashset use kr rahe h hum for tracking the characters and difference rahga sirf time complexity ka 

        // brute
        int maxlen = 0;
        for(int i= 0; i<s.length(); i++){
            HashSet<Character>set = new HashSet<>();
            for(int j= i; j<s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                maxlen = Math.max(maxlen, j-i+1);
            }
        }
        return maxlen;


        // optimized
        // in the optmized wewill be using the sliding window and th two pointer concept in which we will be taking the left and the right pointer wher the left will be stayingf at zero and rght will be incremeting

        // optimized
        int left = 0;
        int maxlen =0;
        HashSet<Character>set = new HashSet<>();
        for(int right = 0; right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen = Math.max(maxlen , right - left+1);
        }
        return maxlen;
    }
}
