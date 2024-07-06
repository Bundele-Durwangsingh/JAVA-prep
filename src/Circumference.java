import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float Radius=input.nextFloat();
        Calculation(Radius);
        input.close();
    }
    static double Calculation(float Radius){
        double Circumference=2*3.14*Radius;
        System.out.println(Circumference);
        return Circumference;
    }
}
