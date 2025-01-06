package Fundamentals.Methods;

import java.util.Scanner;

public class StudentData {

    static String OGANIZATION = "ABC";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        getData(input);
    }
    public static void getData(Scanner input){
        System.out.print("Enetr your name : ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your gender (M/F): ");
        char gender = input.next().charAt(0);
        System.out.print("Enter your phone number: ");
        long phone = input.nextLong(); 
        displayData(name, age, gender, phone);
    }
    public static void displayData(String name , int age ,char gender , long phone){ // Changed phone type to long
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("Organization: " + OGANIZATION);
    }
}
