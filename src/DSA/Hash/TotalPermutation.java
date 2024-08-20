package DSA.Hash;

import java.util.Scanner;

public class TotalPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int[] freq = new int[26]; // Assuming only lowercase letters
        int n = string.length();

        // Counting frequency of each character
        for (int i = 0; i < n; i++) {
            freq[string.charAt(i) - 'a']++;
        }

        // Precompute factorials up to n
        int[] factorials = new int[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        // Calculate total permutations
        int permutation = factorials[n];
        for (int f : freq) {
            if (f > 1) {
                permutation /= factorials[f];
            }
        }

        System.out.println(permutation);
        input.close();
    }
}
