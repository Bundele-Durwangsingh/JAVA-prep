import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numebr 1");
        int num_1 = input.nextInt();
        System.out.println("Enter numebr 2");
        int num_2 = input.nextInt();
        System.out.println("Enter numebr 3");
        int num_3 = input.nextInt();

        if (num_1 > num_2 && num_1 > num_3) {
            System.err.println("Number 1 is greater");
        } else {
            if (num_2 > num_1 && num_2 > num_3) {
                System.out.println("Number 2 is greater");

            } else {
                System.out.println("Number 3 is greater");
            }
        }

        // Easy method using Math function(But it work for only 2 number)
        int LargestNumber = Math.max(num_1, num_2);
        System.out.println("Largest number is " + LargestNumber);

        // For 3 number
        int LargestNumber_3 = Math.max(num_1, (Math.min(num_2, num_3)));
        System.out.println("Largest number is " + LargestNumber_3);
        input.close();
    }
}
