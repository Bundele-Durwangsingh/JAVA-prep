package DSA.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TotalPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int n = string.length();

        // Using HashMap to store frequencies of characters
        Map<Character, Integer> freqMap = new HashMap<>();

        // Counting frequency of each character
        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Precompute factorials up to n
        int[] factorials = new int[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        // Calculate total permutations
        int permutation = factorials[n];
        for (int freq : freqMap.values()) {
            if (freq > 1) {
                permutation /= factorials[freq];
            }
        }

        System.out.println(permutation);
        input.close();
    }
}
