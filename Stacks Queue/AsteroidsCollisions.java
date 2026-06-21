class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // isme basiclly cases ye rahenge ki - 
        // agar current asteriod peek wale se bada h means peeek pr chota element h and current asteriod bada h to peeek wala destroy hojaega and current waha bach jayega
        // wrna agar dono ke magnitude same h to is ccase me dono destroy krdo 
        // wrna agar peek wala elemnt bada h current se to current destroy krdo 

        Stack<Integer>st = new Stack<>();
        for(int aster : asteroids){
            boolean destroyed = false;
            // hume jab tk loop me check krna h asteroids collsions ko jabtk ek to st is not empty and current asteroid jo aara h wo negative h and peek > 0 
            while(!st.isEmpty() && aster < 0  && st.peek() > 0){
                if(st.peek() < -aster){
                    // means peek chota h and aane wala asteroid bada h means wo to destroy krdega peek ko and aage chlta jayega and hume check krna h kab tk krega destrou wo 
                    st.pop();
                }
                else if(st.peek() == -aster){
                    // means dono eqwual hai magnitude me and if they are equal thn dono ek doosre ko destry krdenge and agar aisa hua to hume push nahi krna stack me aane wale asteroid ko 
                    st.pop();
                    destroyed = true;
                    break;
                }
                else{
                    // means current jo aara h asteroid wo chota h and wo peek ko nahi kr payega destroy 
                    destroyed  = true;
                    break;
                }
            }
            if(!destroyed){
                st.push(aster);
            }
        }
        // Now ab stack me ans pada hai 
        int[] ans = new int[st.size()];
        for(int i= st.size() -1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}
