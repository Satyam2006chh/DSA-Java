class Solution {
    public int countGoodSubstrings(String s) {
        int good = 0;
        for(int i= 0; i<s.length()-2; i++){
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            char third = s.charAt(i+2);

            if(first != second && first!=third && second != third){
                good++;
            }
        }
        return good;
    }
}



// key mistake here - 
//   if(first != second != third) wali condition apply krdi thi mene yaha to wo galat h bcoz - 
//   The expression is evaluated from left to right.
//   so java - 
//   first calculates - first != secoond  = true
//   and then true != third which gives u the errror 
//   But third is a char, not a boolean.

//   error: incomparable types: boolean and char
