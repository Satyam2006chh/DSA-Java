// Reaarange the elements by their signs 
// is wali aproch me hum kya krenge ki 2 arraylist lenege pos and neg and usme kya krenge ki pehle normal arr me loop krenge and then usme se pos and neg eleme detect krke pos and neg list me dal lenge aand then firse orig arrme traverse krenge and then usme ab check krenghe pos and neg index and then usme eleme  place krenge list me se 

import java.util.*;
public class RearrangeElementsBySign{
    public static void main(String[] args){
        int[] arr = {3,1,-2,-5,2,-4};
        ArrayList<Integer>pos = new ArrayList<>();
        ArrayList<Integer>neg = new ArrayList<>();
        
        for(int i= 0; i<arr.length; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int posindex = 0;
        int negindex = 0;Q  
        for(int i= 0; i<arr.length; i++){
            if(i%2==0){
                // means its even and if even then pos 
                arr[i] = pos.get(posindex);
                posindex++;
            }
            else{
                arr[i] = neg.get(negindex);
                negindex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


// slight more optmized approch then this is that - 
// ismekya krenge ki ek extra arr le lenge and we kno there wll be equal no of the pos and the neg elem in the orig array as told in the ques so what will be doin is that - we will be iterating in orig arr and ek pos and ek neg lenge and even idx and odd idx me eleme place krte jayenge new arr me and then enew arr hi return krdenge 
public class RearrangeElementsBySign{
    public static void main(String[] args){
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = new int[arr.length];
        int pos = 0;
        int neg= 1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                // means its pos 
                ans[pos] = arr[i];
                pos+=2;
            }
            else{
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}



// same ques but the 2 variety -
// here in ths variety there is no guarangtee that  the no of the pos will be equal to th no of the neg means here there are two cases rising either pos > neg or neg >pos\
import java.util.*;

public class RearrangeElementsBySign {

    public static void main(String[] args) {

        int[] arr = {1,2,3,-1,-2};

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positives and negatives
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > 0) {
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }

        int p = 0;
        int ng = 0;
        int idx = 0;
        while(p < pos.size() && ng < neg.size()) {

            arr[idx++] = pos.get(p++);
            arr[idx++] = neg.get(ng++);
        }
        // Remaining positives
        while(p < pos.size()) {
            arr[idx++] = pos.get(p++);
        }
        // Remaining negative
        while(ng < neg.size()) {
            arr[idx++] = neg.get(ng++);
        }
        System.out.println(Arrays.toString(arr));
    }
}

// why we r not using thr for loop logic here and using the while lloop logic here bcoz of the below reason -
// You are strictly alternating: even index → positive, odd index → negative.
// This assumes that positives and negatives are equal in count.

// If positives > negatives, then when negindex runs out, you’ll get IndexOutOfBoundsException.

// Similarly, if negatives > positives, then posindex will run out.
// That’s why this approach is not safe when counts differ.
