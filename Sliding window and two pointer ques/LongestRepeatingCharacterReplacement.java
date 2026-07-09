class Solution {
    public int characterReplacement(String s, int k) {
        // so basically is ques me kya kaha gaya h ki -
        // hume ek string di gayi h and ek integer k now hume kya krna h length of th longest substring batana h jisme agar hum characters ko k bar replace kreto wo substring me sare chatracters same hojeye
        int ans = 0;
        for(int i = 0; i<s.length(); i++){
            int[]freq = new int[26];
            for(int j = i; j<s.length(); j++){
                freq[s.charAt(j) - 'A']++;
                int maxfreq= 0;
                // ab check krenge ki konse char ki freq sabse jada h us substring me .
                for(int x = 0; x<26; x++){
                    maxfreq = Math.max(maxfreq , freq[x]);
                }
                // now ab hmare pas maxfreq aagayi h ab hume jya krna h ki length nikalni h ki kitne char replace krne pdenge 
                int leen = j - i +1;
                int toreplacelen = (j - i + 1) - maxfreq;
                if(toreplacelen <= k){
                    // means ye substring valid ho sakti h but hume max len wali leni h yad rakhna 
                    ans = Math.max(ans,leen);
                }
            }
        }
        return ans;
    }
}
