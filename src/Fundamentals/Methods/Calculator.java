package Fundamentals.Methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.println();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Result: " + add(input));
                System.out.println();
                    break;
                case 2:
                    System.out.println("Result: " + sub(input));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Result: " + mul(input));
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Result: " + div(input));
                    System.out.println();
                    break;

                case 0:
                System.out.println("Exiting program.....");
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            
        } while (true);
        
    }
    public static double add(Scanner input){
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.println();
        return num1 + num2;
    }
    public static double sub(Scanner input){
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.println();
        return num1 - num2;
    }
    public static double mul(Scanner input){
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.println();
        return num1 * num2;
    }
    public static double div(Scanner input){
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.println();
        return num1 / num2;
    }
}
