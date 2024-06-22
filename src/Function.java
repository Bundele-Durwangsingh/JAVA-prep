import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Addition();
    }
    static void Addition(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number=");
        int Number1=input.nextInt();
        System.out.print("Enter second number=");
        int Number2=input.nextInt();
        int sum = Number1+Number2;
        System.out.println("Addition ="+sum);
        input.close();
    }
}

