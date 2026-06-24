class NextGreaterElementOptimized {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int size = arr.length;
        ArrayList<Integer>list = new ArrayList<>(size);
        for(int i= 0; i<size; i++){
            int maxelement = -1;
            for(int j= i+1; j<size; j++){
                if(arr[j] > arr[i]){
                    maxelement = arr[j];
                    break;
                }
            }
            list.add(maxelement);
        }
        return list;
    }
}


class NextGreaterElementOptimized {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer>list = new ArrayList<>(n);
        Stack<Integer>st = new Stack<>();
        for(int i= n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                // means arr[i] jo aara hai wo top se agar bada ho
                // to usko remove krdo and top me arr[i] daldo
                st.pop();
            }
            if(st.isEmpty()){
                // means agar stack khali h iska matlab ye h ki - next greater element h hi nahi abhi ke liye koi bhi
                list.add(-1);
            }
            else{
                list.add(st.peek());
            }
            st.push(arr[i]);
            
        }
        Collections.reverse(list);
        // why we are doing collections.reverse() bcoz jab tum operations krre ho ques me
        // likee - jab tum add krre ho elements oinside the arraylist to waha kya hora h ki wo first index prm insert hue jare h elements inside the list
        // but u r travelling from th right to left so ans right me se fill hone start hone chaiye naki left me se so us cheez ka dhuan  rakhna ya to colections .reverse krdena 
        // ya fir tum list me pehle sare 0 add krdena and then fir .set ka method use krkr add krte jana
        return list;
        
    }
}
