/*  Java Assignment for CloudVandana..
 *  
 *  Question No:- 2
 *  Write a Java program that takes two strings as input and 
 *  checks if they are anagrams (containing the same characters in a different order).
 * 
 *  Example:
 * 
 *  Input: "listen", "silent"
 *  Output: true
 * 
 *  Input: "hello", "world"
 *  Output: false
 * 
 */


package String;

import java.util.Arrays;

public class AnagramCheck {

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println(areAnagrams(str1, str2));
    }
}

/*
 * Time Complexity:- O(NlogN) Because the Arrays.sort() method.
 * Space Complexity:- O(M) + O(N) => O(N) Because char type array for str1 and str2.
 * 
 * 
 * But it is can be done with O(N) Time Using HashMap.
 */