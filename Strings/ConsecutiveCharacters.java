// leetcode 1446

class ConsecutiveCharacters {
    public int maxPower(String s) {
        // so basically isme hume jya krna h ki - string me jis bhi char ka sabse jada occurence aaya hai wo occurence kitni bar aaya h wo return krdenge bas yehi krna hai 

        int n = s.length();
        int i = 0;
        int maxcount = Integer.MIN_VALUE;
        while(i < n){
            char ch = s.charAt(i);
            int count = 0;
            while(i<n && s.charAt(i) == ch){
                count++;
                i++;
            }
            // ab jaise hi count khatam hogi me check krunga ki wo maxcount h ya fir nahi ? 
            if(count > maxcount){
                maxcount = count;
            }
        }
        return maxcount;
    }
}
