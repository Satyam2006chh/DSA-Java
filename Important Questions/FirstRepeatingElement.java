// First Repeating Element
public class FirstRepeatingElement{
    public static void main(String[] args){
        int[] arr = {10,5,3,4,3,5,6};
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int nums: arr){
            if(map.containsKey(nums)){
                System.out.println(nums);
                break;
            }
            map.put(nums,1);
            
        }
    }
}
