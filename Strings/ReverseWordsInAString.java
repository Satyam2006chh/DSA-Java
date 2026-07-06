class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] result = s.trim().split("\\s+");
        // trim() basically starting and ending se space hatadeta h naaki beech me se
        // split("\\s+")
        // ue str ko spacess ke base pr tod deta h 
        // ab result me kuch aisa aagaya hai - 
        // ["the", "sky","is","blue"];

        String ans = "";
        for(int i= result.length-1; i>=0; i--){
            ans += result[i];
            if(i!=0){
                ans +=" ";
            }
        }
        return ans.trim();
    }
}



// usin string builder class

class Solution {

    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--)
        {
            ans.append(arr[i]);
            if(i != 0)
                ans.append(" ");
        }

        return ans.toString();
    }
}
