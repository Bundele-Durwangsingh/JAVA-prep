package DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2dArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Rows = 3;
        int Col = 3;
        int arr[][] = new int[Rows][Col];
        System.out.println("Enetr the elemnts of 3*3 matrix");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Col; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Final matrix will be");
        for (int[] a : arr) {

            System.out.println(Arrays.toString(a));
        }
        System.out.println("Enter the element you want to search");
        int Element = input.nextInt();
        boolean found = false;
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Col; j++) {
                if (Element == arr[i][j]) {
                    System.out.println("Element founr at " + i + " " + j);
                    found = true;
                }
            }
        }
        if (found) {

        } else {
            System.out.println("element not found");
        }
        input.close();
    }
}
