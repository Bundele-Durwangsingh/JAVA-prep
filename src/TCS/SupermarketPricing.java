package TCS;

public class SupermarketPricing {
    public static void main(String[] args) {
        int n= 5244;
        System.out.println(price(n));
    }

    static int price(int n) {
        int result=1;
        while (n!=0) {
            result*=(n%10);
            n=n/10;
        }
        return result;
    }
}
