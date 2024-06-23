import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check");
        int Number = input.nextInt();
        CheckPrime(Number);
        input.close();
    }
    static int CheckPrime(int Number){
        if (Number == 1) {
            System.out.println("1 is not prime neither composite");
        } else if (Number > 1) {
            boolean isPrime = true;
            for (int i = 2; i < Number; i++) {
                if (Number % i == 0) {
                    System.out.println("Number is not prime");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Number is prime");
            }
        } else {
            System.out.println("invalid ");
        }
        return Number;
    }
}
