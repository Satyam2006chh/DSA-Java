class Solution {
    public int celebrity(int mat[][]) {
        Stack<Integer>st = new Stack<>();
        int possible = mat.length;
        for(int i= 0; i<possible; i++){
            st.push(i);
        }
        // ab stk me all posssble ans aagaye h
        while(st.size() > 1){
            // ye wali condition isliye li bcoz hume jab tk dhoondna h jabtk ek element na bacha ho bs stack ke andar
            int x = st.peek();
            st.pop();
            
            int y = st.peek();
            st.pop();
            
            if(mat[x][y] == 1){
                // means the x knows y 
                // so x cannot be the celebrity.
                // but y can be the celebrity
                st.push(y);
            }
            else{
                // means mat[x][y] == 0 means x dont know y
                // so y cannot be celeb
                st.push(x);
            }
        }
        // ab jo stack me element pda h wo sirf ek hoga
        // and also jo ek wo element hoga
        // we cnnot say that it will be celebrity  - jab tk hum check na krle
        int celeb = st.peek();
        for(int i= 0; i<possible; i++){
            if(i!=celeb && (mat[i][celeb] == 0 || mat[celeb][i] == 1)){
                return -1;
            }
        }
        return celeb;
    }
}
