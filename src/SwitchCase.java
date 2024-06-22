import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a fruit");
        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("A yellow fruit");
                break;
            case "Apple":
                System.out.println("A red fruit");
                break;
            case "Banana":
                System.out.println("A long yellow fruit");
                break;
            case "Orange":
                System.out.println("A round orange Fruit");

            default:
                System.out.println("Enter a valid fruit");
                break;
        }
        input.close();
    }
}
