import java.util.*;
public class Problem_Selection_0{
    public static void main(String[] args){
        // it works by dividing the array into sorted and the unsorted part 
        int arr[] = {29, 10, 14, 37, 13};
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            int min = i;
            for(int j = i; j<=n-1; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // now swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
