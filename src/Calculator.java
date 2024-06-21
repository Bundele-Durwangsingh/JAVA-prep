import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Answer=0;
        while (true) {
            System.out.println("Select the operator (+) (-) (*) (/) (%)");
            
            char op=input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter 2 number");
                System.out.print("Number 1= ");
                int Number_1=input.nextInt();
                System.out.print("Number 2= ");
                int Number_2=input.nextInt();
                if (op== '+'){
                    Answer=Number_1+Number_2;
                }if (op=='-'){
                    Answer=Number_1-Number_2;
                }if(op=='*'){
                    Answer=Number_1*Number_2;
                }if(op=='/'){
                    if(Number_2!=0){
                        Answer=Number_1/Number_2;
                    }else{
                        System.out.println("Cannot divide by 0");
                    }
                }if (op=='%'){
                    Answer=Number_1%Number_2;
                }
            }else if(op=='x' || op== 'X'){
                break;
            }else{
                System.out.println("Wrong operand");
            }
            System.out.println("Result is = "+Answer);
            System.out.println("Enter (x) or (X) to close");
        }
        input.close();
    }
}
