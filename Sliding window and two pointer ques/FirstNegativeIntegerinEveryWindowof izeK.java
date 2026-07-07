class Solution{
    // First Negative Integer in Every Window of Size K
    public static void main(String[] args){
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        // For every window of size k, print the first negative integer.
        
        // brute
        // generate all the windows and in each window as soon as u get
        // the first negative integer print it and move to another window and if not found any then print the zero
        ArrayList<Integer>list  = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            boolean found = false;
            for(int j = i; j<i+k; j++){
                if(arr[j] < 0){
                    list.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if(!found){
                list.add(0);
            }
        }
        for(int num : list){
            System.out.println(num);
        }
        
        
        // optmized approch using thr sliding window 
        // dekho har ek window me dekhna h negative number ki aaya na nahi
        // if nahi aaya to 0
        
        
        ArrayList<Integer>list = new ArrayList<>();
        Queue<Integer>q = new LinkedList<>();
        // isme basically hum kya krenge ki normal windows me trasverse krenghe and negative jaise hi ayega seedha queue me dal denge 
        int left = 0;
        for(int right = 0; right < arr.length; right++){
            if(arr[i] < 0){
                q.offer(arr[right]);
            }
            // bech bech me check bhi krna ki window size reach hua ya nahi
            if(right - left + 1 == k){
                // if reached to we have to slide to necxt window but before sliding we have to push the first negative of  that windiw ti the array list
                if(q.isEmpty()){
                    list.add(0);
                }
                else{
                    list.add(q.peek());
                }
                // now jab hum next windiw jaare h to kuch elements repeat to hore hai and if kuch elements repeat hore h toh ho sakta h pichli window se hi koi number aisa h jo first negative ho 
                if(!q.isEmpty() && q.peek() == arr[left]){
                    q.poll();
                }
                left++;
            }
        }
        return list;
        
    }
}
