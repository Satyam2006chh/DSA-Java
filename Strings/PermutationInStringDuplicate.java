permutation in string 
class PermutationInStringDuplicate {
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
}class PermutationInStringDuplicate {
    public boolean isPalindrome(String s) {
        // isme pehle check krenge ki char is alphanumeric or not ? 
        // if its alphanumeric then check it and if not them skip it bcox we have to check for the alpha numeric only 
        int left = 0;
        int right = s.length()-1;

        while(left <= right){
            if(!isalphanumeric(s.charAt(left))){
                left++;
                continue;
            }
            if(!isalphanumeric(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    
    }
    public boolean isalphanumeric(char ch){
        if((ch >= '0' && ch<='9') || (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')){
            return true;
        }
        return false;
    }


}

// remove all occurence

class PermutationInStringDuplicate {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            // means jab tk part is inside the s jabtk we have to run the loop
            int index = s.indexOf(part);
            // ye hume starting index dedega part ka if its exist 
            if(index != -1){
                // agr part exist krta h to use remove krna h and subtstring func use krte hue last wala index is not included inside the prt so make sure for that'
                s = s.substring(0, index) + s.substring(index + part.length());
            }

        }
        return s;
    }
}



// pallindrome 2

class PermutationInStringDuplicate {
    public boolean validPalindrome(String s) {
        // deho sabse pehle palindrom wo hota h jisko chahe seedha pado ya ulta same hi milega 
        // 2ptr approch me left and rught rakho 
        // for palindrom - left = right
        int left = 0;
        int right = s.length()-1;
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
                // agar aise chlo to sahi h else me jab jayega jab mismatch hoga
            }
            else{
                return checkpalindrome(s, left+1, right) || checkpalindrome(s,left,right-1);
            }
        }
        return true;
    }
    public boolean checkpalindrome(String s, int left, int right){
        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


permutation in string 
class PermutationInStringDuplicate {
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
