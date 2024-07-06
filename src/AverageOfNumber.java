import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int Number_1=input.nextInt();
        System.out.println("Enter second number");
        int Number_2=input.nextInt();
        System.out.println("Enter third number");
        int Number_3=input.nextInt();
        int Average=Average(Number_1, Number_2, Number_3);
        System.out.println("Total averaeg = "+Average);
        input.close();
    }
    static int Average(int Number_1,int Number_2, int Number_3){
        int Average=(Number_1+Number_2+Number_3)/3;
        return Average;
    }
}
