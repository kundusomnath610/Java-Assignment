/*
 * This is the Better solution using HashMap from previous one
 * It is using HashMap for storing the element like key value pair.
 * 
 * Map Store the key Value and increment the value with +1. for str.
 * Map Decrease the vaue one by one, when it completly empty it means the string is Anagrams 
 * And at the end return the EmptyString.
 */


package String;

import java.util.HashMap;

public class AnagramHash {
    public static boolean areAnagrams(String str1, String str2) {
        // Normalize strings: remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Use HashMap to count character occurrences
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count frequency of characters in str1
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrease frequency of characters in str2
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // Extra character found
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c); // Remove character when count reaches zero
            }
        }

        // If the map is empty, they are anagrams
        return charCount.isEmpty();
    }

    public static void main(String[] args) {
        // String str1 = "listen";
        // String str2 = "silent";

        // System.out.println(areAnagrams(str1, str2)); // Output: true

        String str1 = "hello";
        String str2 = "world";

        System.out.println(areAnagrams(str1, str2)); // Output: false
    }
}

/*
 * 
 * Time Complexity:
    O(N) + O(N) = O(N)
    First loop: Builds the HashMap -> O(N)
    Second loop: Decreases count -> O(N)

   Space Complexity:
    O(1) (For fixed 128 ASCII chars or 26 lowercase letters)
    If input contains all unique characters, O(N) in the worst case.
 * 
 * 
 */