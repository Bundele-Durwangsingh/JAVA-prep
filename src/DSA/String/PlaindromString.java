package DSA.String;

import java.util.Scanner;

public class PlaindromString {
    public static void main(String[] args) {
        String temp = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String OriginalString = input.nextLine();
        for (int i = 0; i < OriginalString.length(); i++) {
            char ch = OriginalString.charAt(i);
            temp = ch + temp;
        }
        if (OriginalString.equalsIgnoreCase(temp)) {
            System.out.println("Stirng is palindrom");
        } else {
            System.out.println("Stirng is not palindrom");
        }
        input.close();
    }
}
