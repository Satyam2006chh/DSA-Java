// lower bound  - means first element which is greater than or equal to the target 
// its very usefull bcoz it helps us in getting the insertion position in the array

// public class LowerBoundMeansFirstElementWhichIsGreaterThanOrEqualToTheTarget{
//     public static void main(String[] args){
//         int[] arr = {1,2,4,4,4,6,8};
//         int n = arr.length;
//         int target = 4;
//         int ans = -1;
        
//         int start = 0;
//         int end = n-1;
//         while(start <= end){
//             int mid = start + (end - start)/2;
//             if(arr[mid] >=  target ){
//                 ans = mid;
//                 end = mid - 1;
//                 // bcoz agar mid >= target means aage jitne bhielement honge they all will be greate than or eq to target but we means the first element >= target so for the loweer bound 
                
//             } 
//             else{
//                 // means the mid is not >= target so we will be doing the mid + 1 bcoz us case me bada element mid se aage hi hoga frr sure 
//                 start = mid+1;
//             }
//         }
//         System.out.println(ans);
//     }
// }


// for the upper bound = first element which is > target not >= 


// public class LowerBoundMeansFirstElementWhichIsGreaterThanOrEqualToTheTarget{
//     public static void main(String[] args){
//         int[] arr = {1,2,4,4,4,6,8};
//         int n = arr.length;
//         int target = 4;
//         int ans = -1;
        
//         int start = 0;
//         int end = n-1;
//         while(start <= end){
//             int mid = start + (end - start)/2;
//             if(arr[mid] > target ){
//                 ans = mid;
//                 end = mid - 1;
//                 // agar mid > target means mid is possble ans but we need the first ans
                
//             } 
//             else{
//                 // means mid jo hai wo < target means ans to midse aage milega that whyy go aheaddddd
//                 start = mid+1;
//             }
//         }
//         System.out.println(ans);
//     }
// }



// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.


// public class LowerBoundMeansFirstElementWhichIsGreaterThanOrEqualToTheTarget{
//     public static void main(String[] args){
//         int[] arr = {1,3,5,6};
//         int start = 0;
//         int n = arr.length;
//         int end = n-1;
//         int target =2;
        
//         int result = arr.length;
        
//         while(start <= end){
//             int mid = start + (end - start) /2;
//             if(arr[mid] == target){
//                 // means target is already presetn inside the arr we do not have to see the insertion pos only retiurn the ans 
//                 result = mid;
//                 break;
//             }
//             else if(arr[mid] >= target) {
//                 // /yaha ye jab aayega jab ye mid me na ho to lower bound ka concept lagana pdega yaha par hume 
//                 result = mid;
//                 end = mid-1;
                
                
//             }
//             else{
//                 start = mid+1;
//             }
//         }
//         System.out.println(result);
//     }
// }



// floor and the ciel in the sorted array 

// floor  - Greatest element smaller than or equal to target
// for target = 7
// 2
// 4
// 6 ✅
// 8 ❌
// 10 ❌

// CEIL
// Smallest element greater than or equal to target

// Meaning:

// smallest value >= target

// For target = 7:

// 2 ❌
// 4 ❌
// 6 ❌
// 8 ✅
// 10 ❌

// now the flooor in the sorted array 
public class LowerBoundMeansFirstElementWhichIsGreaterThanOrEqualToTheTarget{
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9};
        int n = arr.length;
        int ans = -1;
        int target = 6;
        // fllor means largets value which is <= target means 5 
        int start = 0;
        int end = n - 1;
        
        while(start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] <= target){
                // means mid chota h and ho sakta hai aage aur large element ho aisa jo target se chota ho
                ans = mid;
                start = mid+1;
            }
            else{
                // means mid > or >= target but hume chota chaiye 
                end = mid-1;
            }
        }
        System.out.println(ans);
    }
}



// now for the ciel 
public class LowerBoundMeansFirstElementWhichIsGreaterThanOrEqualToTheTarget {
    public static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // possible ceil
            if(arr[mid] >= target) {
                ans = arr[mid];
                // try finding smaller valid value
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}



// first and the last occurencer of an element inside the array

// codeee fr the first occurence for  the array
public class LowerBoundMeansFirstElementWhichIsGreaterThanOrEqualToTheTarget{
    public static void main(String[] args){
        int[] arr = {1,2,4,4,4,4,7,8};
        int target = 4;
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                // means mid par target h storekrlo
                first = mid;
                // and first occurnce dhoondni h means agar mid par hai to chances haii ki wo mid se pehle bhi present ho 
                end = mid-1;
            }
            else if(arr[mid] > target){
                // mesans target chota h and if target chota hhai then wo aage to milegs nahi thats why reduce tge search space 
                end = mid - 1;
            }
            else{
                // means na mid par haii and na hi mid > target hai means mid < target hai and if mid < target hai to first occurence to aage hi milega 
                start = mid+1;
            }
        }
        System.out.println(first);
    }
}

// for the last occurecne code 

public class LowerBoundMeansFirstElementWhichIsGreaterThanOrEqualToTheTarget{
    public static void main(String[] args){
        int[] arr = {1,2,4,4,4,4,7,8};
        int target = 4;
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        
        while(start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] == target){
                // means mid par hai and for the last occurence we have tp search for that above the mid too 
                last = mid;
                start = mid+1;
            }
            else if(arr[mid] > target){
                // means mid > target 
                // mens target aage to h ni mid ke peeche hi hoga 
                end = mid-1;
            }
            else{
                // means less than target and if less than to last bhi aage hi milegi 
                start = mid+1;
            }
        }
        System.out.println(last);
        
    }
}



// count how many times an elemnt has occured inside the sored array  - isme agar tum loop krke count krdoge to O(n) aayega but as thearr is sorted O(logn) laaane ke liye iska ans hoga - 
// count = last - first + 1





// search in rotated sorted arr 1
class Solution {
    public int search(int[] nums, int target) {
        // agar koi bhi arr was in the asc order and if its rotated then one of its part always remains sorted chahe kuch bhi hojaye 
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while(start <= end){
            int mid = start + (end - start) /2;
            if(nums[mid] == target){
                // means mid par hi pda h we dont have to search in anywhere or there is no need of the complex searching rules 
                result = mid;
                return result;
            }
            // now we will be checking either the left part is sorted or the right part is sorteed so that wr can decide that where we have to search 
            if(nums[start] <= nums[mid]){
                // means the left part is sorted and we have to search inside tghe left part 
                if(target >=nums[start] && target < nums[mid]){
                    // means left part sorted to hai hi and element jo hum dhoond rahe h wo left part me hi sorrtd hai 
                    end = mid - 1;
                }
                else{
                    // means the left part was sorted byut the element is not inside that part so there is no need for searching the element in the left part anymore 
                    start = mid+1;
                }
            }
            else{
                // means the right part is sorted and we have to check whether the element is present insdie that par or not ? 
                if(target > nums[mid] && target <= nums[end]){
                    // means right part to sorted hai and element bhii roght me h 
                    start = mid + 1;
                }
                else{
                    // right sorted hai lekin target not inside the right to search insde the left
                    end = mid-1;
                }
            }
        }
        return result;
    }
}




// search in the rotated sorteed array part 2

class Solution {
    public boolean search(int[] nums, int target) {
        // its same as the search in rotated sorte arr 1 but there are very slight changes 
        // which we have to do bcoz the arr migh contains the dupkicates here so we have to make sure of some of the edge cases to prevent the error

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
                continue;
            }
            // now check which part of th array is sorted 
            if(nums[start] <= nums[mid]){
                // means the left part is sorted so will be checking for the target inside the left part and if its not present inside that part then will be searching fo that inside the right part

                if(target >= nums[start] && target < nums[mid]){
                    // means left me hi h 
                    end = mid - 1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[end]){
                    // means right me h 
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}


// peak index in the mountian arr 

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        // here the simple thign we have to keeep in the mind is that the peak element caanot be present at the 0th index and the last index of thw arr so make sure that isme se start ko 0 and end k0 n-1 mt lena wrna kuch comparisons hum aise kr rahe honge joki error denge ki index oout of bounds 
        // so instead of handlng the small small edge cases  which make our code long we will be starting with the start = 1 and end = n-2 so that koi errorr na aaye 
        if(nums.length == 1){
            return 0;
        }
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        int start = 1;
        int end = nums.length - 2;

        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;


            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                // agar aage and peeche walo se bada h to peak h ofc
                result = mid;
                return result;
            }
            else if(nums[mid] > nums[mid-1]){
                // means peeche se to bada h leking aage se nahi means possible ans aage h 
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }
}



// finding the peaks inside the arr leetocd no - 2951

class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer>result = new ArrayList<>();
        int n = mountain.length;
        for(int i = 1; i<n-1; i++){
            if(mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]){
                // means peak
                
                result.add(i);
            }
        }
        return result;
    }
}



// single element inside the soreted arr 

class Solution {
    public int singleNonDuplicate(int[] nums) {
        // isme basically ye concept ha
        // agar ek array me perfectly duplicates hai to uska size always evem hoga
        // whereas if there is the presence of the duplicates with the single element diff then the size will always be oddd
        
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        int n = nums.length;
        while(start <= end){
            int mid = start + (end - start) /2;
            // edge cases
            if(nums.length == 1){
                return nums[0];
            }
            if(mid == 0 && nums[0] != nums[1]){
                return nums[mid];
            }
            if(mid == n-1 && nums[n-1] != nums[n-2]){
                return nums[n-1];
            }
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                result = nums[mid];
                return result;
            }
            else if(mid % 2 == 0){
                // mmeans even size array h and if mid-1 = mid hai means peeche even elements reh jayenge jisme ek duplicate h and ek odd rehjayega 
                if(nums[mid-1] == nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                // odd wala caase
                if(nums[mid-1] == nums[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return result;
        
    }
}




// CEHCK FOR THE MIN IN ROTATED SORTED ARR

public class LowerBoundMeansFirstElementWhichIsGreaterThanOrEqualToTheTarget {

    public static int findMin(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            // AGAR PURA PART SORTED HAI
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            // LEFT HALF SORTED HAI
            if (arr[low] <= arr[mid]) {

                ans = Math.min(ans, arr[low]);

                // RIGHT SIDE JAO
                low = mid + 1;

            } else {

                // RIGHT HALF SORTED HAI
                ans = Math.min(ans, arr[mid]);

                // LEFT SIDE JAO
                high = mid - 1;
            }
        }

        return ans;
    }
}



// COUNT HOW MANY TIMES AN ARRAY HAS BEEN ROATED = MIN ELEMENT KA INDEX

public class LowerBoundMeansFirstElementWhichIsGreaterThanOrEqualToTheTarget {

    // Minimum find karne wala function
    public static int findMin(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            // AGAR SORTED HAI
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            // LEFT SORTED
            if (arr[low] <= arr[mid]) {

                ans = Math.min(ans, arr[low]);

                low = mid + 1;
            }

            // RIGHT SORTED
            else {

                ans = Math.min(ans, arr[mid]);

                high = mid - 1;
            }
        }

        return ans;
    }

    // Rotation count
    public static int countRotations(int[] arr) {

        int min = findMin(arr);

        // Minimum ka index find karo
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == min) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,1,2,3};

        System.out.println("Rotations = " + countRotations(arr));
    }
}
