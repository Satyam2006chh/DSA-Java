// reverse the NUMBER 

public class ReverseTheNumber{
    public static void main(String[] args){
        int num= 1234;
        int reverse = 0;
        while(num> 0){
            int lastdig = num % 10;
            reverse = (reverse * 10) + lastdig;
            num  = num / 10;
        }
        System.out.println(reverse);
    }
}
