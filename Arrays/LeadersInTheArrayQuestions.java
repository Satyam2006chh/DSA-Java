// leaders in the array questions 
// An element in the array is said to be leader if its greater than all the elements to its rightsideee


// brute force apperoch
public class LeadersInTheArrayQuestions {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// optmized approch for the leader in th arr ques 

public class LeadersInTheArrayQuestions {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        System.out.print("Leaders: " + maxFromRight + " "); // last
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }
}
