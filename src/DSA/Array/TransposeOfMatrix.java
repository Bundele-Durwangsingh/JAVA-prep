package DSA.Array;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elemet of 3*3 matrix");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        System.out.println("Final matrix will be ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of matrix will be");

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
