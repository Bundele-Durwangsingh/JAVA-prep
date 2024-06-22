import java.util.Scanner;

public class FunctionWithReturn {
    public static void main(String[] args) {
        int Answer=Addition();
        System.out.println("Answer="+Answer);
        String Greet = Greet();
        System.out.println(Greet);
    }
    static int Addition(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number=");
        int Number1=input.nextInt();
        System.out.print("Enter second number=");
        int Number2=input.nextInt();
        int sum = Number1+Number2;
        input.close();
        return sum;
        
    }
    static String Greet(){
        String greet ="Hello from developer";
        return greet;
    }
}


