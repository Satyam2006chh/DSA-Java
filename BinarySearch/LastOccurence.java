// for the last occurecne code
 

public class LastOccurence{
    public static void main(String[] args){
        int[] arr = {1,2,4,4,4,4,7,8};
        int target = 4;
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        
        while(start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] == target){
                // means mid par hai and for the last occurence we have tp search for that above the mid too 
                last = mid;
                start = mid+1;
            }
            else if(arr[mid] > target){
                // means mid > target 
                // mens target aage to h ni mid ke peeche hi hoga 
                end = mid-1;
            }
            else{
                // means less than target and if less than to last bhi aage hi milegi 
                start = mid+1;
            }
        }
        System.out.println(last);
        
    }
}
