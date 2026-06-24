// first and the last occurencer of an element inside the array


// codeee fr the first occurence for  the array
public class FirstOccurence{
    public static void main(String[] args){
        int[] arr = {1,2,4,4,4,4,7,8};
        int target = 4;
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                // means mid par target h storekrlo
                first = mid;
                // and first occurnce dhoondni h means agar mid par hai to chances haii ki wo mid se pehle bhi present ho 
                end = mid-1;
            }
            else if(arr[mid] > target){
                // mesans target chota h and if target chota hhai then wo aage to milegs nahi thats why reduce tge search space 
                end = mid - 1;
            }
            else{
                // means na mid par haii and na hi mid > target hai means mid < target hai and if mid < target hai to first occurence to aage hi milega 
                start = mid+1;
            }
        }
        System.out.println(first);
    }
}
