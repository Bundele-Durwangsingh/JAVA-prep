import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Array for intenger
        int[] Integer = new int[5];
        System.out.println("Enter the value");

        for (int i = 0; i < Integer.length; i++) {
            Integer[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(Integer));
        input.close();

        // Array for string
        String [] str = new String[5];
        System.out.println("Enter the value");
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        input.close();

    }
}
