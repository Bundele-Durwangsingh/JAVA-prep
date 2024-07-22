package DSA.LeetCode.String;

import java.util.Arrays;

public class ValidAnagram {
    /**
     * Approach:
     * This solution checks if two strings are anagrams by sorting the characters of both strings and comparing them.
     * 
     * Explanation:
     * 1. Check if the lengths of the two strings `s` and `t` are different. If they are, return false.
     * 2. Convert both strings to character arrays.
     * 3. Sort the character arrays.
     * 4. Compare the sorted character arrays using `Arrays.equals()`.
     *    - If they are equal, return true (the strings are anagrams).
     *    - Otherwise, return false (the strings are not anagrams).
     */
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t)); // Check if s and t are anagrams and print the result
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are different, they cannot be anagrams
        }

        char[] FirstChars = s.toCharArray(); // Convert first string to character array
        char[] SecondChars = t.toCharArray(); // Convert second string to character array

        Arrays.sort(FirstChars); // Sort the character array of the first string
        Arrays.sort(SecondChars); // Sort the character array of the second string

        return Arrays.equals(FirstChars, SecondChars); // Compare sorted char arrays
    }
}
