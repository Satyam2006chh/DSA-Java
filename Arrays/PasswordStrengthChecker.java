// password strenght checker  

class Solution {
    public int passwordStrength(String password) {
        // Each character contributes at most once, even if it appears multiple times.
        // this above line is very important means every char single bar me count krna h
        // agar wo multiple time aaya to fir nahi krenge count 
        // means multiple time agar occur hua h elemen to ek bar hi count krna h use 

        // iske liye hum approch krenhge ki set me eelement daldenge start me and har ek new char ko check krenghe ki ye set me hai ya fir nahi agar hua means multiple time aaya toignore kro and agar nahi hua to ek bar aaaya then use count kro so this is the main apprch

        HashSet<Character>set = new HashSet<>();
        int stren = 0;
        for(int i = 0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);

                if(ch >= 'a' && ch <= 'z'){
                    stren += 1;
                }
                else if(ch >= 'A' && ch <= 'Z'){
                    stren += 2;
                }
                else if(ch >= '0' && ch <= '9'){
                    stren += 3;
                }
                else if(ch == '!' || ch == '@' || ch == '#' || ch == '$'){
                    stren += 5;
                }

            }
        }
        return stren;
    }
}
