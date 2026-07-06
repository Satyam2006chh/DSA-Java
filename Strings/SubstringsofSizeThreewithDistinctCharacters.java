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

// -------------------------------------------------------------------------------------------------

// Also when to try this approch of taking characters like in this ques we did - 

// Yahan Sliding Window ki zarurat kyu nahi padi?
// Kyuki har substring ke liye sirf 3 comparisons karne the.
    
// Ab Second Question (1456)
// Question:
// Find maximum vowels in every substring of length k.

// Ab main tumse ek question puchhta hoon.
// Case 1
// Window 1
// abc
// Next
// bcd
// Question hai:
// "Are all characters different?"
// Kya tum sirf a aur d dekh kar answer bata sakte ho?
// Nahi.
// Kyuki b aur c bhi compare karne padenge.
// Case 2
// Window
// abc
// Question hai
// "Kitne vowels hain?"
// Pehle answer tha
// 1 vowel
// Next
// bcd
// Kya tum sirf
// a gaya
// d aaya
// dekh kar answer nikal sakte ho?
// Haan.
// Kyuki b aur c waise ke waise hi hain.

// --------------------------------------------------------------------------------------------------    
    
    // key mistake here - 
//   if(first != second != third) wali condition apply krdi thi mene yaha to wo galat h bcoz - 
//   The expression is evaluated from left to right.
//   so java - 
//   first calculates - first != secoond  = true
//   and then true != third which gives u the errror 
//   But third is a char, not a boolean.

//   error: incomparable types: boolean and char
