import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check if a number is an Armstrong number");
        System.out.println("2. List all 3-digit Armstrong numbers");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter number to check:");
                int number = input.nextInt();
                if (CheckArmstrong(number) == number) {
                    System.out.println(number + " is an Armstrong number");
                } else {
                    System.out.println(number + " is not an Armstrong number");
                }
                break;

            case 2:
                System.out.println("All 3-digit Armstrong numbers are:");
                for (int i = 100; i < 1000; i++) {
                    if (AllArmstrong(i) == i) {
                        System.out.println(i);
                    }
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }

    static int CheckArmstrong(int number) {
        
        int check = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            check = check + (remainder * remainder * remainder);
        }
        return check;
    }

    static int AllArmstrong(int number) {
        int check = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            check = check + (remainder * remainder * remainder);
        }
        return check;
    }
}
