// Find Kth Distinct Element Using HashMap

// arr = {1,2,2,3,4,4,5}
// k = 2

// 1,3,5 - distinct elements 
// for k  = 2 ans = 3

public class FindKthDistinctElementUsingHashmap{
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5};
        int k = 2;
        int count = 0;
        
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int nums : arr){
            if(!map.containsKey(nums)){
                map.put(nums, 1);
            }
            else{
                map.put(nums, map.get(nums)+1);
            }
        }
        // Now we have stored freq now check for the distinct 
        
        for(int nums  : arr){
            if(map.get(nums) == 1){
                count++;
                if(count == k){
                    System.out.println(nums);
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
}


// Count the freq using the hashmap 

import java.util.*;
public class FindKthDistinctElementUsingHashmap {
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,1,4,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}



// first unique element using the map
import java.util.*;

public class FindKthDistinctElementUsingHashmap {
    public static void main(String[] args) {

        int arr[] = {2,3,4,2,3,5,6};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num : arr){

            if(map.get(num) == 1){
                System.out.println("First Unique = " + num);
                break;
            }
        }
    }
}


// check if two arrays are equal or not 

import java.util.*;

public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        int arr1[] = {1,2,2,3};
        int arr2[] = {2,1,3,2};

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int num : arr1){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }

        for(int num : arr2){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }

        if(map1.equals(map2)){
            System.out.println("Arrays are Equal");
        }
        else{
            System.out.println("Arrays are Not Equal");
        }
    }
}


// find the duplicates using the hashmap

import java.util.*;

public class FindKthDistinctElementUsingHashmap {
    public static void main(String[] args) {

        int arr[] = {1,2,3,2,4,5,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }
}



// find the highest freq eleement 

import java.util.*;

public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        int arr[] = {1,2,2,3,3,3,4};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxFreq = 0;
        int answer = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                answer = entry.getKey();
            }
        }

        System.out.println(answer);
    }
}


// First Repeating Element
public class FindKthDistinctElementUsingHashmap{
    public static void main(String[] args){
        int[] arr = {10,5,3,4,3,5,6};
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int nums: arr){
            if(map.containsKey(nums)){
                System.out.println(nums);
                break;
            }
            map.put(nums,1);
            
        }
    }
}




// Find Common Elements Using Set
public class FindKthDistinctElementUsingHashmap{
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8};
        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();
        
        for(int nums : arr1){
            set1.add(nums);
        }
        for(int nums : arr2){
            set2.add(nums);
        }
        
        
        for(int num: set1){
            if(set2.contains(num)){
                System.out.println(num);
            }
        }

    }
}


// Find Missing Elements Using Set Difference
// A = {1,2,3,4,5}
// B = {2,4}
// 1
// 3
// 5

import java.util.*;

public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        int A[] = {1,2,3,4,5};
        int B[] = {2,4};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int num : A){
            set.add(num);
        }

        for(int num : B){
            set.remove(num);
        }

        System.out.println(set);
    }
}


// first repeating element inside the set 
import java.util.*;

public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {
        int arr[] = {10,5,3,4,3,5,6};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                System.out.println("First Repeating Element = " + num);
                return;
            }
            set.add(num);
        }
        System.out.println("No Repeating Element");
    }
}


// Union and intersection of the arras
import java.util.*;

public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8};

        LinkedHashSet<Integer> union = new LinkedHashSet<>();

        for(int num : arr1){
            union.add(num);
        }

        for(int num : arr2){
            union.add(num);
        }

        System.out.println("Union = " + union);

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        System.out.print("Intersection = ");

        for(int num : arr2){

            if(set.contains(num)){
                System.out.print(num + " ");
            }
        }
    }
}


// Reverse Words in a Sentence
public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        String str = "I love Java";

        String words[] = str.split(" ");

        for(int i = words.length - 1; i >= 0; i--){

            System.out.print(words[i] + " ");
        }
    }
}


// Check if Two Strings are Anagrams
import java.util.Arrays;

public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}


// Check if One String is Rotation of Another

public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "CDAB";

        if(s1.length() != s2.length()){

            System.out.println("Not Rotation");
            return;
        }

        String temp = s1 + s1;

        if(temp.contains(s2))
            System.out.println("Rotation");
        else
            System.out.println("Not Rotation");
    }
}


// Find First Non-Repeating Character
public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {
        String str = "aabbcdde";
        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(
                    "First Non-Repeating Character = "
                    + str.charAt(i)
                );
                break;
            }
        }
    }
}

// Remove Duplicate Characters from String
public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        String str = "programming";
        String result = "";

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(result.indexOf(ch)==-1){
                result += ch;
            }
        }

        System.out.println(result);
    }
    
}


// Pallindromic string
public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        String str = "madam";
        String rev = "";

        for(int i=str.length()-1;i>=0;i--){

            rev += str.charAt(i);
        }

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}


// find the longest word inside th sstring 
public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        String str =
            "Java is a powerful language";

        String words[] = str.split(" ");

        String longest = "";

        for(String word : words){

            if(word.length() > longest.length()){

                longest = word;
            }
        }

        System.out.println(
                "Longest Word = " + longest);
    }
}


// replace the char wit the @
public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        String str = "I Love Java";

        str = str.replace(' ','@');

        System.out.println(str);
    }
}

// 25. Convert String to Uppercase Without Built-in Function

public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        String str = "hello java";
        String result = "";

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        System.out.println(result);
    }
}

// Check if Two Strings are Equal Ignoring Case

public class FindKthDistinctElementUsingHashmap {

    public static void main(String[] args) {

        String s1 = "HELLO";
        String s2 = "hello";

        if(s1.equalsIgnoreCase(s2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
