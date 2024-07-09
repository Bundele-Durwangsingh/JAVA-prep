package Fundamentals.Condition;
import java.util.*;

public class Condition {
    public static void main(String[] args) {
        System.out.println("Please enter salary ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if(salary>=20000){
            System.out.println("salary after bonus = " +(salary+2000));
        }else{
            System.out.println("salary after bonus = "+(salary+1000));
        }
        input.close();
        
    }
}
