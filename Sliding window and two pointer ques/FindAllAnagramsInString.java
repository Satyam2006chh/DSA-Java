class Main{
    public static void main(String[] args){
        // You are given a text and the pattern and u have to find that how many times the anagrasm of the pattern inside the text is theree...
        
        // leetcode 438 + leetcode 567 will be easy fy if u solve all these
        
        // brute- 
        // generate all the substrings of the strinng of the length pattern string anc check for every character 
        
        int[] patternarr = new int[26];
        int k = pattern.length();
        int ans = 0;
        for(char ch : pattern.toCharArray()){
            patternarr[ch - 'a']++;
        }
        for(int i= 0; i<str.length() - k; i++){
            int[] freq = new int[26];
            for(int j = i; j<i+k; j++){
                freq[str.charAt(j) - 'a']++;
            }
            if(Arrays.equals(patternarr,freq)){
                ans++;
            }
        }
        return ans;
    }
}


// optimized approch

import java.util.*;

public class Main {
    public static int countAnagrams(String txt, String pat) {
        int k = pat.length();
        int[] pattern = new int[26];
        int[] window = new int[26];
        // Store pattern frequency
        for (int i = 0; i < k; i++) {
            pattern[pat.charAt(i) - 'a']++;
        }
        int count = 0;
        // Traverse the text
        for (int i = 0; i < txt.length(); i++) {
            // Add current character to window
            window[txt.charAt(i) - 'a']++;
            // Remove left character if window size becomes greater than k
            if (i >= k) {
                window[txt.charAt(i - k) - 'a']--;
            }
            // Compare frequencies when window size is k
            if (i >= k - 1) {
                if (Arrays.equals(pattern, window)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String txt = sc.next();
        System.out.print("Enter Pattern: ");
        String pat = sc.next();
        int ans = countAnagrams(txt, pat);
        System.out.println("Number of Anagrams = " + ans);
        sc.close();
    }
}
