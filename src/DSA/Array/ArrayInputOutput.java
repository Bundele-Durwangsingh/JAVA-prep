package DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int Size = input.nextInt();
        int Number []= new int[Size];
        
        System.out.println("Enter the element of array");
        for (int i = 0; i < Size; i++) {
            Number[i]=input.nextInt();
        }
        System.out.println("print using loops");
        System.out.println("Elements of array");
        for (int i = 0; i < Size; i++) {
            System.out.println(Number[i]);
        }
        System.out.println("Print using toString function");
        System.out.println(Arrays.toString(Number));
        input.close();
    }
}
