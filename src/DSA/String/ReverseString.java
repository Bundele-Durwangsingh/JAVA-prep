package DSA.String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String temp = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String OriginalString = input.nextLine();
        for (int i = 0; i < OriginalString.length(); i++) {
            char ch=OriginalString.charAt(i);
            temp=ch+temp;
        }
        System.out.println(temp);
        input.close();
    }
}
