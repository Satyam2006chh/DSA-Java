import java.util.*;
public class Problem_Bubble_0{
    public static void main(String[] args){
        int[] arr = {5,1,4,2,8};
        int n = arr.length;
       
        for(int  i = 0; i<n-1; i++){ 
int didswap = 0;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didswap = 1;
                }
            }
            if(didswap == 0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
