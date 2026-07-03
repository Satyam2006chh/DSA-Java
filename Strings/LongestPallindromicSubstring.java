// Longest pallindromic substring -

// Brute force approch = 

// Input:
// s = "babad"
// Output:
// "bab"
// or
// "aba"


// Generate all substrings
// ↓
// Check whether each substring is palindrome
// ↓
// Keep track of the longest one


// code

class Main{
    public static void main(String[] args){
        String longest = "";
        String str = "babad";
        for(int i= 0; i<str.length(); i++){
            for(int j= i; j<str.length(); j++){
                String sub = str.substring(i, j+1);
                if(ispallindrome(sub)){
                    if(sub.length() > longest.length()){
                        longest = sub;
                    }
                }
            }
        }
        System.out.println(longest);
    }
    public static boolean ispallindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<=right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}

