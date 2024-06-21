import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int Number = input.nextInt();
        int Answer = 0;
        while (Number > 0) {
            int Remnder = Number % 10;
            Number = Number / 10;
            Answer = Answer * 10 + Remnder;
        }
        System.out.println("Number after reverse");
        System.out.println(Answer);
        input.close();
    }
}
