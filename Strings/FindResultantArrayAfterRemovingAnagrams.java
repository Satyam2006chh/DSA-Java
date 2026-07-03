class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String>list = new ArrayList<>();
        list.add(words[0]);

        for(int i= 1; i<words.length; i++){
            // ab is word ko phle char array me lenge and then sort krenge
            char[] arr = words[i].toCharArray();
            Arrays.sort(arr);

            // ab lenge wo wala word jo humne add kra tha list me basically the 0th index word
            String wordtocheck = list.get(list.size()-1);
            char[] arr1 = wordtocheck.toCharArray();
            Arrays.sort(arr1);

            if(!Arrays.equals(arr,arr1)){
                // means first wala jo element tha wo anagram nahi tha zero wale ka
                // means both were different so not anagram 
                // so push the first to list
                list.add(words[i]);
            }
        } 
        return list;
    }
}
