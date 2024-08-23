package DSA.Search;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, -1, -2, -3, -4, -5 };
        System.out.println("enter the element to search");
        int target = input.nextInt();
        int answer = Check(arr, target);
        System.out.println(answer);
        input.close();
    }

    static int Check(int[] num, int target) {
        if (num.length == 0) {
            return -1;
        }
        for (int index = 0; index < num.length; index++) {
            int element = num[index];
            if (element == target) {
                System.out.print("present at index ");
                return index;
            }
        }
        return -1;
    }
}
