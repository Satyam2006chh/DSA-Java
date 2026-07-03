class Solution {
    public int addDigits(int num) {
        // isme sabse pehle approch ye rahegi meri ki .
        // sabse pehle modulo krke last digit nikallunga and then sum me add krdunga
        // inner loop modulo wali jab tk chlti jayegi
        // jab tk num > 0 hai. and jaise hi less than zero hoga hum num = sum krdenge
        // and then check krenge ki if num >= 10 -> if yes then continue otherwise return num

        while(num >= 10){
            int sum = 0;
            while(num > 0){
                int lastdig = num % 10;
                sum += lastdig;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}
