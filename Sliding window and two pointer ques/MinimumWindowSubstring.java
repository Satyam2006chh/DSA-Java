class Solution {
    public String minWindow(String s, String t) {
        // iska brute hi kr raha hu optimal bad me krenge

        // so basically hume is ques me aisa chota substring return krna hai s ka jisme t ke sare ke sare characters avail ho 
        if(t.length() > s.length()){
            return "";
        }
        int[] freq = new int[128];
        for(int i= 0; i<t.length(); i++){
            freq[t.charAt(i)]++;
        }
        String res = "";
        int minlen = Integer.MAX_VALUE;
        for(int i = 0; i<s.length();i++){
            int[] newfreq = new int[128];
            for(int j = i; j<s.length(); j++){
                newfreq[s.charAt(j)]++;
                if(isvalid(newfreq,freq)){
                    // means it contains all the characters of the of the t and if it contsins all th chsr of th t then see if its min or not and if its min then go for it
                    if(j- i + 1 < minlen){
                        minlen = j-i+1;
                        res = s.substring(i, j+1);
                    }
                }
            }
        }
        return res;
    }
    public boolean isvalid(int[]arr1, int[]arr2){
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] < arr2[i]){
                return false;
            }
        }
        return true;
    }
}
