// Find Common Elements Using Set
public class FindCommonElements{
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8};
        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();
        
        for(int nums : arr1){
            set1.add(nums);
        }
        for(int nums : arr2){
            set2.add(nums);
        }
        
        
        for(int num: set1){
            if(set2.contains(num)){
                System.out.println(num);
            }
        }

    }
}
