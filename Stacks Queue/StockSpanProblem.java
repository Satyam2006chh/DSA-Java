class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer>list = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
        for(int i= 0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                // means tht day has arrived where the value is higher than all the prev days 
                list.add(i+1);
            }
            else{
                int ans = i - st.peek();
                list.add(ans);
            }
            st.push(i);
        }
        return list;
    }
}




// brute approch below - 

public static int[] stockSpanBrute(int[] price) {

    int n = price.length;
    int[] span = new int[n];
    for (int i = 0; i < n; i++) {
        int count = 1;
        for (int j = i - 1; j >= 0; j--) {
            if (price[j] <= price[i])
                count++;
            else
                break;
        }
        span[i] = count;
    }
    return span;
}
