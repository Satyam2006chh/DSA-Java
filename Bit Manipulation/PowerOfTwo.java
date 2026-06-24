class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        // here the concept of the xor is used 
        // the power of two always have th laast bit as 1 only 1times
        if(n<=0){
            return false;
        }
        return (n & (n-1)) == 0;
    }
}
