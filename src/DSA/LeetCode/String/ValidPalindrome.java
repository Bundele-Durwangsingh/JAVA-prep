package DSA.LeetCode.String;

public class ValidPalindrome {
    /**
     * Approach:
     * This solution checks if a given string is a valid palindrome, ignoring non-alphanumeric characters
     * and case differences. It uses a two-pointer technique to compare characters from both ends of the cleaned string.
     * 
     * Explanation:
     * 1. Check if the input string `s` is null. If it is, return false.
     * 2. Create a `StringBuilder` to store the cleaned string that contains only alphanumeric characters in lowercase.
     * 3. Traverse the input string character by character:
     *    - Append each alphanumeric character (converted to lowercase) to the `StringBuilder`.
     * 4. Initialize two pointers: `left` at the start of the cleaned string and `right` at the end.
     * 5. Use a while loop to compare characters at the `left` and `right` pointers:
     *    - If characters at these pointers are different, return false (not a palindrome).
     *    - Otherwise, move both pointers towards the center.
     * 6. If the loop completes without finding differing characters, return true (is a palindrome).
     */
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        if (s == null) {
            return false; // Return false if the input string is null
        }

        StringBuilder cleaned = new StringBuilder(); // Initialize a StringBuilder to build the cleaned string
        for (char ch : s.toCharArray()) { // Traverse the input string character by character
            if (Character.isLetterOrDigit(ch)) { // Check if the character is alphanumeric
                cleaned.append(Character.toLowerCase(ch)); // Convert to lowercase and append to the StringBuilder
            }
        }

        int left = 0; // Initialize left pointer at the start of the cleaned string
        int right = cleaned.length() - 1; // Initialize right pointer at the end of the cleaned string

        while (left < right) { // Compare characters from both ends
            if (cleaned.charAt(left) != cleaned.charAt(right)) { // If characters do not match
                return false; // Return false, not a palindrome
            }
            left++; // Move left pointer towards the center
            right--; // Move right pointer towards the center
        }

        return true; // Return true if all characters matched, the string is a palindrome
    }
}
