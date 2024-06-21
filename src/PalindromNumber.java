import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check palindrom");
        int Number = input.nextInt();
        int TempVar=Number;
        int Answer = 0;
        while (Number > 0) {
            int Remnder = Number % 10;
            Number = Number / 10;
            Answer = Answer * 10 + Remnder;
        }
        if(Answer==TempVar){
            System.out.println("Entered number is palindrom");
        }else{
            System.out.println("Entered number is not a palindrom");
        }
        input.close();
    }
}
