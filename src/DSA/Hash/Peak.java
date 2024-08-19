package DSA.Hash;

import java.util.HashMap;
import java.util.Scanner;

public class Peak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        // Reading input and populating the map with frequencies
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Checking conditions
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if ((key == max && freq > 1) || (key != max && freq > 2)) {
                System.out.println("False");
                input.close();
                return;
            }
        }

        System.out.println("True");
        input.close();
    }
}
