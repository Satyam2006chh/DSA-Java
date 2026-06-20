// COUNT OF ALL THE DIGITS OF THE NUMBERS 

public class CountOfAllTheDigitsOfTheNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int count = 0;
        while(num > 0){
            int lastdig = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
