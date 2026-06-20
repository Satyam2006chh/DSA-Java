// container with the max water brute approch 
class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        for(int i= 0; i<height.length; i++){
            for(int j = i+1; j<height.length; j++){
                // area hojaega apna w * h 
                int w = j - i;
                // height wo lenge hum jo choti ho bcoz badi agar height leli to water flow out hojaega to choti heigght tak water lena chaiye hmesha taki container ke andar hi rahe hmesha wo 
                int height_cont = Math.min(height[i], height[j]);
                int area = height_cont * w;
                max_area = Math.max(max_area,area);
            }
        }
        return max_area;
    }
}


// now the optmizal approch 
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxwater = 0;

        while(left < right){
            int width = right - left;
            int heights = Math.min(height[right], height[left]);
            int area = width  * heights;

            maxwater = Math.max(maxwater , area);

            if(height[left]  < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;

    }
}
