class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        // power of 3 ka koi rule nahi h jaise power of 2 me tha ki like power of 2 me hmesha binary me 1bit hona chaiye and jaise hi hum n& (n-1) krenge to wo zero de dega 
        // a numher if the power oof 3 if we divide the number again and again by 3 until it becomes 1 
        if(n<=0){
            return false;
        }
        while(n % 3 == 0){
            n =  n / 3;
        }
        return  n == 1;
    }
}
