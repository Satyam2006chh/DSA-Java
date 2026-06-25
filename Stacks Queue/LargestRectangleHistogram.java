class Solution {
    public int largestRectangleArea(int[] heights) {
        // So this below is the brute force approch 
        int ans = 0;
        int n = heights.length;
        for(int i= 0; i<n; i++){
            int left = i;
            int right = i;

            int height_of = heights[i];
            while(left > 0 && heights[left-1] >= heights[i]){
                left--;
            }
            while(right < n-1 && heights[right+1] >= heights[i]){
                right++;
            }
            int width = right - left + 1;
            int area = height_of * width;

            ans = Math.max(area, ans);
        }
        return ans;

    }
    

// optmized approach 


class Solution {
    public int largestRectangleArea(int[] heights) {
        // so below is the optmized approch 
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer>st = new Stack<>();

        // first finding the right nearest smaller and using the stack
        for(int i= n-1; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i] = n;
            }
            else{
                right[i] = st.peek();
            }
            st.push(i);
        }

        // now fo the left nearest for evry bar
        // us se pehle stack ko clear krdo
        st.clear();

        // left nearrest  
        for(int i= 0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i] = -1;
            }
            else{
                left[i] = st.peek();
            }
            st.push(i);
        }

        // now we have filled the left and the right array with the elements and now we have to cal the area for the each bar and have to return th max area out of all

        int ans = 0;
        for(int i= 0; i<n; i++){
            int width = right[i] - left[i] - 1;
            int height  = heights[i];
            int area = width * height;
            ans = Math.max(ans , area);
        }
        return ans;
    }
}
}
