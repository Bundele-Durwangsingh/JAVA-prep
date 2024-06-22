import java.util.Scanner;

public class FunctionWithParameter {
    public static void main(String[] args) {
        int ans = sum(20, 30);
        System.out.println(ans);


        //Advance concept
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.next();
        String greeting = Greet(name);
        System.out.println(greeting);
        input.close();

    }

    static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    static String Greet(String name) {
        String greet = "Hello " + name;
        return greet;
    }
}
