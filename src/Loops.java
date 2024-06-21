import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Please enter value of num ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // For loop
        for (int i = 1; i <= num; i++) {
            System.out.println("for Loop is running " + i);
        }

        // While loop
        while (num > 0) {
            System.out.println("while loop is running " + num);
            num--;
        }

        // do while loop
        do {
            System.out.println("Do while loop running " + num);
            num--;
        } while (num > 0);

        input.close();
    }
}
