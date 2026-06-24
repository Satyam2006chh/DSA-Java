class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        for(int i= 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch =='[' || ch == '{'){
                // means agar opening bracket h to une stack me daldo
                st.push(ch);
            }
            else{
                // yaha aaate h 2 cases 
                // 1 - ya to opening aaya hi nahi seedha closing aaay - stack empty hoga us case me 
                if(st.isEmpty()){
                    return false;
                }
                // means opening aaya h ab par jp char h wo opening nahi h
                char attop = st.peek();
                if((attop == '(' && ch == ')') || (attop == '[' && ch == ']') || (attop == '{' && ch == '}')){
                    st.pop();
                }
                else{
                    // means clsoing bhi nahi h lekin kuch aur h 
                    return false;
                }
                
            }
        }
        return st.isEmpty();
    }
}
