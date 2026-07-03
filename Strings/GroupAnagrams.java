class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // so basically anagram wo hote h  - 
        // Jisme same freq of char hote h and length same hoti h bas order different hota h
        // rest all are samee

        HashMap<String, List<String>>map = new HashMap<>();
        // ab hum traverse krenge inside the string

        for(String words : strs){
            // ab first work lenge and use char array me bdlenge and then sort krdenge and then map me daldenge 
            char[] arr = words.toCharArray();
            Arrays.sort(arr);

            // now word has been sorted ab use hum map me dalenge
            // but map me dalne se pehle hum use string me convert krenge

            String key = new String(arr);
            if(map.containsKey(key)){
                // means pehle se hi sorted way me key thi and agar aise h to hume usme add krna h word ko so that wo usme group me add hojaye
                map.get(key).add(words);
            }
            else{
                // means map mee wo key nahi thi and agar wo key nahi thi to pehle wo key ko dalo and uski value me new ArrayList dalo
                map.put(key, new ArrayList<>());
                map.get(key).add(words);
            }
        }
        return new ArrayList<>(map.values());
    }
}
