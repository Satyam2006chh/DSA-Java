class ValidPalindrome {
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
