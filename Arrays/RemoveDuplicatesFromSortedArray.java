// brute force approch forr remvoing the duplicates from the arrays sorted arrays 

public class RemoveDuplicatesFromSortedArray{
    public static void main(String[] args){
        int arr[] = {1,1,2,2,2,3,3};
        LinkedHashSet<Integer>set = new LinkedHashSet<>();
        
        for(int i = 0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int index = 0;
        for(Integer num : set){
            arr[index] = num;
            index++;
        }
        System.out.println("The new size of arr is : " + index);
        for(int i = 0; i<index; i++){
            System.out.println(arr[i]);
        }
        
    }
}


// now the optimized approch for the same question .
class Main{
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,3,3,3,4,4};
        int index = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[index]){
                // means wo pehle element milgaya jo 1 se alag h and uske aage aane ko tyaaf hai
                arr[index+1] = arr[i];
                index++;
            }
        }
        for(int i = 0; i<=index; i++){
            System.out.println(arr[i]);
        }
    }
    
}
