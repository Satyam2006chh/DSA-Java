public class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0 ;i<n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        
        for(int i= 0; i<n; i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondlargest){
                secondlargest = arr[i];
            }
        }
        System.out.println("The largest is : "+ largest);
        System.out.println("The secondlargest is :"+ secondlargest);
    }
}
