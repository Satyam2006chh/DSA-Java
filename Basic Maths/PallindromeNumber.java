// pallindrome number 


public class PallindromeNumber{
    public static void main(String[] args){
        int num= 1234;
        int reverse = 0;
        int copy = num;
        while(num> 0){
            int lastdig = num % 10;
            reverse = (reverse * 10) + lastdig;
            num  = num / 10;
        }
        if(reverse == copy){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }
    }
}
