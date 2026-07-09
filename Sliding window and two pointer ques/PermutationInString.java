class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq1 = new int[26];
        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }
        // Check every substring of length s1.length()
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] freq2 = new int[26];
            for (int j = i; j < i + s1.length(); j++) {
                freq2[s2.charAt(j) - 'a']++;
            }
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }
        return false;
    }
}


// now the optmized approch 

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            // Add current character
            freq2[s2.charAt(right) - 'a']++;
            // Shrink if window becomes larger than s1
            if (right - left + 1 > s1.length()) {
                freq2[s2.charAt(left) - 'a']--;
                left++;
            }
            // Compare when window size is equal
            if (right - left + 1 == s1.length()) {

                if (Arrays.equals(freq1, freq2)) {
                    return true;
                }
            }
        }

        return false;
    }
}
