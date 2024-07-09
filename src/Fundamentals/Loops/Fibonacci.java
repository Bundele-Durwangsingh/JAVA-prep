package Fundamentals.Loops;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int FinalNum = input.nextInt();
        System.out.println("Fibonacci series will be ");
        int FirstNum=0;
        int SecondNum=1;
        int Count=2;
        while(Count<=FinalNum){
            System.out.println(SecondNum + " ");
            int TempVar=SecondNum;
            SecondNum=FirstNum+SecondNum;
            FirstNum=TempVar;
            Count++;
        }
        System.out.println(SecondNum);
        input.close();
    }
}
