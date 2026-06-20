// Find square root of a number

public class FindSquareRootOfANumber{
    public static void main(String[] args){
        int start = 0;
        int target = 25;
        int end = target;
        int ans = 0;
        
        while(start <= end){
            int mid  = start + (end-start)/2;
            long square = (long) mid * mid;
            if(square == target){
                ans = mid;
                return ans;
            }
            else if(square < target){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
};


class Solution {
    public int nthRoot(int n, int m) {
        // isme basically m is the target
        // means koi number ko agar n bar multiply kre to m aayega ya fir nahii
        if(m <= 0){
            return 0;
        }
        
        int start = 1;
        int end = m;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            long value = 1;
            for(int i = 1; i<=n; i++){
                value = value * mid;
            }
            if(value == m){
                ans = mid;
                return ans;
            }
            else if(value < m){
                // means value choti h and ans bada hai to aage jana pdega ma 
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}


class Solution {
    public boolean isvalid(int[] arr, int total_books, int k, int mid){
        // k = number of the students.
        // agar koi arrr[i] aisa hua joki mid se hi bada hogaya to waise hi nahi kr paoge aap allocate to usme to kr hi do return false;
        
        int student = 1;
        int pages = 0;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] > mid){
                return false;
                // arr = [2,1,3,10]
                // mid = 5
                // U can take this exampleee
            }
            if(pages + arr[i] <= mid){
                pages += arr[i];
            }
            else{
                // means pages ka sum jada hogaya hai ek mid se 
                student++;
                pages = arr[i];
            }
        }
        // ye false jab dga jab ya to studnts hi greater than k hojaye 
        if(student > k){
            return false;
        }
        else{
            return true;
        }
    }
    public int findPages(int[] arr, int k) {
        // here the total number of the books are basically the length of the array 
        int total_books = arr.length;
        // here the k are the no of the students 
        
        // if the no of the students arer more then the no pf the books  then it will not be  able to distributr thr books among them
        if(k > total_books){
            return -1;
        }
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        // here sum is basically the max no of the books which can be allocated to the students 
        // the minimun no of the books which can be allocated  = 0;
        int start = 0;
        int end = sum;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(isvalid(arr, total_books, k, mid)){
                ans = mid;
                end = mid-1;
                
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
        
    }
}

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        // first we will be doin the brute force approch 
        // in which the time complex will be o(n*m;)
        // int max1 = -1;
        // int rowswithmax = -1;

        // for(int i= 0; i<mat.length; i++){
        //     int count= 0;
        //     for(int j= 0; j<mat[0].length; j++){
        //         if(mat[i][j] == 1){
        //             count++;
        //         }
        //     }
        //     if(count > max1){
        //         rowswithmax = i;
        //         max1 = count;
        //     }
        // }
        // int[] result = new int[2];
        // result[0] = rowswithmax;
        // result[1] = max1;
        // return result;


        // Now the optmized approch
        // basically the rows are sorted here means 0 and 1 in sorrted way
        // so if we know the firsst pos where the one occurs w can find how many ones are there
        // by doingg - rowsize of that row - first index where the one occurs

        int max1 = -1;
        int rowswithmax = -1;
        for(int i= 0; i<mat.length; i++){
            int firstone = firstOne(mat[i]);
            if(firstone != -1){
                // ab yaha minus krke nikalenge ki kitne one h where firrst one will be giving u the index where the frst 1 occured
                int count = mat[i].length - firstone;
                if(count > max1){
                    max1 = count;
                    rowswithmax = i;
                }
            }
        }
        int[] result = new int[2];
        result[0] = rowswithmax;
        result[1] = max1;
        return result;


    }
    public int firstOne(int[] row){
        int left = 0;
        int right = row.length - 1;
        int count = -1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(row[mid] == 1){
                count = mid;
                right = mid-1;
            }
            else{
                // means zero h wo and if zero then aage dhundo
                left = mid+1;
            }
        }
        return count;
    }
}



leetcode 74 - 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // brute force approch first
        // where we hae to double the loop.

        // for(int i= 0;i<matrix.length; i++){
        //     for(int j =0; j<matrix[0].length; j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;


        // Now the optimized apprioch
        // Here inside the ques there are 2 most important properties - 
        // 1- Every row is sorted
        // 2- Every first integer of thee row is always greater than the last integer of evry row

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while(left <= right){
            int mid = left + (right - left) /2;
            int row = mid / cols;
            int col = mid % cols;

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                // means targ aage hai 
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}





class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // isme briute force y h ki manual 2 loops chalao one for row and one for col
        // and check kro ki is elem  present or not ?

        // Optmized approrch - 

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        while(row < rows && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
        
    }
}



// sqrt x

class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        if(x==1){
            return 1;
        }

        int left = 0;
        int high = x;
        int ans = 0;

        while(left <= high){
            int mid = left + (high - left)/2;
            long sq = (long) mid * mid;

            if(sq == x){
                ans = mid;
                return ans;
            }

            else if(sq < x){
                ans = mid;
                left = mid+1;
            }
            else{
                high= mid-1;
            }
        }
        return ans;
        
    }
}


// nth root
class Solution {
    public int nthRoot(int n, int m) {
        // isme basically m is the target
        // means koi number ko agar n bar multiply kre to m aayega ya fir nahii
        if(m <= 0){
            return 0;
        }
        
        int start = 1;
        int end = m;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            long value = 1;
            for(int i = 1; i<=n; i++){
                value = value * mid;
                if(value > m){
                    break;
                }
            }
            if(value == m){
                ans = mid;
                return ans;
            }
            else if(value < m){
                // means value choti h and ans bada hai to aage jana pdega ma 
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}




// smallest divisor with threshold
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // isme starting means low will be from 1 bcoz 1 is the smalest divisor and the sum which will be given whn 1 is taken as the divisor  = largest

        // and we have to take the divisor till the max element inside the arrr
        // suppose max is 5 and u r taking the divsor = 9
        // then after 5 every ans will be 1 so the sum and thw ans will never change so its not the thing we want 

        int low = 1;
        int maxi = 0;
        for(int num : nums){
            if(num > maxi){
                maxi = num;
            }
        }
        int possans = 0;
        int high = maxi;
        while(low <= high){
            int mid = low + (high - low) /2;
            // ab kya krna h low ko lena h and sare elments se divide krna h and make sure to check for the threshold 
            int sum = 0;
            for(int num : nums){
                 sum += (int) Math.ceil((double) num / mid);
            }
            if(sum <= threshold){
                possans = mid;
                // and agar tume sum aur chota chaiye to below is the relation 
                // jaise jaise divisor badta jayega sum decrease hota jayega
                high = mid-1;
            }
            else{
                // means the sum >= threshold
                // and if its greater tha threshold then hume divisor badana hoga 
                // as the divisor increases the sum goes down 
                low = mid + 1;
            }
        }
        return possans;
        
    }
}class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // isme starting means low will be from 1 bcoz 1 is the smalest divisor and the sum which will be given whn 1 is taken as the divisor  = largest

        // and we have to take the divisor till the max element inside the arrr
        // suppose max is 5 and u r taking the divsor = 9
        // then after 5 every ans will be 1 so the sum and thw ans will never change so its not the thing we want 

        int low = 1;
        int maxi = 0;
        for(int num : nums){
            if(num > maxi){
                maxi = num;
            }
        }
        int possans = 0;
        int high = maxi;
        while(low <= high){
            int mid = low + (high - low) /2;
            // ab kya krna h low ko lena h and sare elments se divide krna h and make sure to check for the threshold 
            int sum = 0;
            for(int num : nums){
                 sum += (int) Math.ceil((double) num / mid);
            }
            if(sum <= threshold){
                possans = mid;
                // and agar tume sum aur chota chaiye to below is the relation 
                // jaise jaise divisor badta jayega sum decrease hota jayega
                high = mid-1;
            }
            else{
                // means the sum >= threshold
                // and if its greater tha threshold then hume divisor badana hoga 
                // as the divisor increases the sum goes down 
                low = mid + 1;
            }
        }
        return possans;
        
    }
}
Why Binary Search?

Observe:

Divisor	Sum
1	17
2	10
3	7
4	7
5	5
6	5
7	5
Divisor ↑
Sum ↓



class Solution {
    public int minTime(int[] arr, int k) {
        int lowest  = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : arr){
            if(num > lowest){
                lowest = num;
            }
            sum += num;
        }
        int low = lowest;
        int high = sum;
        
        int ans = 0;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(ispossible(arr,k,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean ispossible(int[] arr, int k, int mid){
        int painters_count = 1;
        int summ = 0;
        for(int num : arr){
            if(num > mid){
                return false;
            }
            if(summ + num <= mid){
                summ += num;
            }
            else{
                painters_count++;
                if(painters_count > k){
                    return false;
                }
                summ = num;
            }
            
        }
        return true;
    }
}



split thr arr largest sum


class Solution {
    public int splitArray(int[] nums, int k) {
        int lowest = Integer.MIN_VALUE;
        int totalsum = 0;
        for(int vals : nums){
            if(vals > lowest){
                lowest = vals;
            }
            totalsum += vals;
        }

        int low = lowest;
        int high = totalsum;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(ispossible(nums,k,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            
            }
        }
        return ans;

    }
    public boolean ispossible(int[] arr, int k, int mid){
        int subarr = 1;
        int sum = 0;
        for(int num : arr){
            if(sum + num <= mid){
                sum+=num;
            }
            else{
                sum = num;
                subarr++;
                if(subarr > k){
                    return false;
                }
            }
        }
        return true;
    }
}



median of 2 sort arrays 

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // brute force approch 
        // for the same size sorted arrays 
        int[] merged = new int[nums1.length + nums2.length];
        int i= 0;
        int j= 0; 
        int k= 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                // means i chota h and j bada h 
                merged[k++] = nums1[i++];
            }
            else{
                merged[k++] = nums2[j++];
            }
        }

        // ab merged me sare elements aaagaye h for the safety check we will be itersting over the while loop again so that the arrays remain empty and merged will be filled with all the elements inside the arrays 

        while(i<nums1.length){
            merged[k++] = nums1[i++];
        }
        while(j<nums2.length){
            merged[k++] = nums2[j++];
        }

        if(merged.length %2 == 0){
            // means its a evwe sized array 
            return (merged[merged.length/2] + merged[(merged.length/2)-1]) / 2.0;
        }
        else{
            return (merged[merged.length/2]);
        }
    }
}


// optmized apprcih 
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;

        int i = 0;
        int j = 0;

        int prev = 0;
        int curr = 0;

        for (int k = 0; k <= n / 2; k++) {

            prev = curr;

            if (i < nums1.length && j < nums2.length) {

                if (nums1[i] < nums2[j]) {
                    curr = nums1[i];
                    i++;
                } else {
                    curr = nums2[j];
                    j++;
                }

            } else if (i < nums1.length) {

                curr = nums1[i];
                i++;

            } else {

                curr = nums2[j];
                j++;

            }
        }

        if (n % 2 == 0) {
            return (prev + curr) / 2.0;
        }

        return curr;
    }
}
