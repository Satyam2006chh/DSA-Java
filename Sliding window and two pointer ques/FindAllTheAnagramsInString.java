class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // basically u r given two strings s and the p  ad what u have to do is that find all the starting index of the anagrams of p inside the s and store it and return it at the end of the code
        // brute - generate all the substring of the length 3 and of that substring is anagram then take the starting ijndex of the substring 
        int[]freq = new int[26];
        for(int i = 0; i<p.length(); i++){
            freq[p.charAt(i) - 'a']++;
        }
        // now freq array consist of all th char and their freq inside the array named freq
        int part = p.length();
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i<=s.length() - p.length(); i++){
            int[] newfreq = new int[26];
            for(int j = i; j<i+part; j++){
                newfreq[s.charAt(j) - 'a']++;
            }
            if(Arrays.equals(newfreq,freq)){
                list.add(i);
            }
        }
        return list;


        // optmized apprich

        int[] freq = new int[26];
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i<p.length(); i++){
            freq[p.charAt(i) - 'a']++;
        }

        int left = 0;
        int [] newfreq = new int[26];
        for(int right = 0; right <s.length() ;right++){
            newfreq[s.charAt(right) - 'a']++;

            // if the windo size is exceeded
            if(right - left + 1 > p.length()){
                newfreq[s.charAt(left) - 'a']--;
                left++;
            }
            // if the windo size becomes equal to the part size
            // then check tht window is valid or not 

            if(right - left + 1 == p.length()){
                if(Arrays.equals(newfreq,freq)){
                    list.add(left);
                }

            }    
        }
        return list;
    }
}
