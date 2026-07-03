class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for(int i= 0; i<chars.length(); i++){
            char ch = chars.charAt(i);
            freq[ch - 'a']++;
        }
        // Now ab freq array bhar chuki h
        // isme sare char ki freq bhar rakhi h jo jo chars me the

        // ab hum loop krenge ek ek krke in words 
        // particular word ko uthayenge from words.
        // and then us word ke char ko access krenge 
        // and then hum freq arr ka clone krenge and word ke char minus krenge iside the .cloned arr
        int sum = 0;
        for(String word : words){
            int[] temp = freq.clone();
            boolean ispossible = true;
            for(char ch : word.toCharArray()){
                temp[ch - 'a']--;

                if(temp[ch - 'a'] < 0){
                    ispossible = false;
                    break;
                }
            }
            if(ispossible){
                sum += word.length();
            }
        }
        return sum;
    }
}
