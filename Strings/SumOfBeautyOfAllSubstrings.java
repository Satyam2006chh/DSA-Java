class Solution {
    public int beautySum(String s) {
        // first we will be using the brute approch - 
        // in the brute approch waht will bee  doingg is = generate all th substrings and then find the freq of all char inside the substrinjng and then calc the beauty thats all
        int beauty = 0;
        for(int i= 0; i<s.length(); i++){
            for(int j= i; j<s.length(); j++){
                int maxfreq = 0;
                int minfreq = Integer.MAX_VALUE;
                int[] freq = new int[26];
                for(int k= i; k<=j; k++){
                    freq[s.charAt(k) - 'a']++;
                }
                // jaise hi loop end hogi substring generate hojaegi ek 
                for(int nums : freq){
                    if(nums > 0){
                        maxfreq = Math.max(maxfreq,nums);
                        minfreq = Math.min(minfreq, nums);
                    }
                }
                beauty += maxfreq - minfreq;


            }
        }
        return beauty;
    }
}



class Solution {
    public int beautySum(String s) {
        // here we will be solving using the optimized approch 
        // in bruite force the mistake which we were doing ws that ki we were actually counting the freeq of the char again and agaain means suppose first susbtring is aab then we calc freq of a a b and second substring is aabc here sirf neeww char c add hua h baki sab poorane h hum poorane walo ko bhi firs count krre the joki koi fayda nahi tha 

        // in optmized we will not again calc the freq of old char 
        // new ayega jaise hi bas uski freq calc krenge nothing else.

        int beauty = 0;
        for(int start = 0; start < s.length(); start++){
            int[]freq = new int[26];
            for(int j = start; j<s.length(); j++){
                freq[s.charAt(j) - 'a']++;
                int maxfreq = 0;
                int minfreq = Integer.MAX_VALUE;
                for(int nums : freq){
                    if(nums > 0){
                        maxfreq = Math.max(maxfreq , nums);
                        minfreq = Math.min(minfreq,nums);
                    }
                }
                beauty += maxfreq-minfreq;
            }
        }
        return beauty;
    }
}
