// Missing number in thw array 

class MissingNumberInThwArray {

    public static void main(String[] args) {

        int[] arr = {0,1,2,4};

        int n = 4;

        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i <= n; i++) {

            xor1 = xor1 ^ i;
        }
        for(int i = 0; i < arr.length; i++) {

            xor2 = xor2 ^ arr[i];
        }

        int missing = xor1 ^ xor2;

        System.out.println("Missing Number = " + missing);
    }
}
