import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enetr the number");
        int Number= input.nextInt();
        Sum(Number);
        input.close();
    }
    static int Sum(int Number){
        int Sum=0;
        for (int i = 0; i <=Number; i++) {
            
            if (i%2!=0) {
            Sum=Sum+i;
                
            }
            
        }System.out.println(Sum);
        return Sum;
    }
}
