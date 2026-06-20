// Move the zeroes to the end wala ques 
// brute force approch 

// isme basically tum kya kroge ki ek temp ke nam se array lo and then orighnal array me traverse kro and then jitne bhi non zero numbers hai un sabko temp me store krdo and then wapas ieterate kro orignal array me and starting me sare non zero eleme bhardo in the orignal and then kya krna ki  - 
// jab jo space khali bache inside the orignal fill them with the zero so tht all the zero elements will be at the last of the array

// class MoveZeroes {
//     public static void main(String[] args) {

//         int[] arr = {1,0,2,3,0,0,4,0,5,0,6};
//         int[] temp = new int[arr.length];

//         int j = 0;
//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] != 0) {

//                 temp[j] = arr[i];
//                 j++;
//             }
//         }
//         // Copy temp back into original array
//         for(int i = 0; i < arr.length; i++) {
//             arr[i] = temp[i];
//         }
//         for(int nums : arr) {
//             System.out.print(nums + " ");
//         }
//     }

// }



// Now basicially the optmize approch 
// two ptr approch 


class MoveZeroes{
    public static void main(String[] args){
        int[] arr = {1,0,2,3,0,0,4,0,5,0,6};
        int firstzero = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                firstzero = i;
                break;
            }
        }
        if(firstzero == -1){
            return;
        }
        for(int i = firstzero + 1; i<arr.length; i++){
            if(arr[i] != 0){
                // means non zero  hai 
                int temp = arr[i];
                arr[i] = arr[firstzero];
                arr[firstzero] = temp;
                firstzero++;
            }
        }
        for(int nums : arr) {
            System.out.print(nums + " ");
        }
        
    }
}
