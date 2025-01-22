package Variable;

public class SwapVariable {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        System.out.println("Value before swap a: "+a+" b: "+b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Value after swap a: "+a+" b: "+b);
    }
}
