permutation in string 
class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        // isme s1 ko dhoonda h inside the s2
        // s1 ki permutations inside the s2 to gve the ans 
        int[] freq1 = new int[26];
        for(int i= 0; i<s1.length(); i++){
            freq1[s1.charAt(i) - 'a']++;
        }

        // freq1 = array jisme s1 ki frequency store kari hui h 
        // ab kya krenge ek loop chalayenge for storing the freq of the s2

        int windowsize = s1.length();
        // bcoz window size utna lena h jitne char ya fir jis len ki str find krni h s2 me
        for(int i = 0; i<=s2.length() - windowsize; i++){
            // here i represent the each valid window.ka starting index
            int[] freq2 = new int[26];
            for(int j = i; j< i+ windowsize; j++){
                freq2[s2.charAt(j) - 'a']++;
            }
            if(issame(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
    public boolean issame(int[] arr1, int[] arr2){
        for(int i= 0; i<26; i++){
            if(arr1[i] !=arr2[i]){
                return false;
                // bcoz agar main func ki loop khatam hogai and if perm mili h to false kabi return nahi ho sakta
            }
        }
        return true;
    }
}
