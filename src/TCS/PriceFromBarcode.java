package TCS;

public class PriceFromBarcode {
    public static void main(String[] args) {
        String bar = "CD#34";
        System.out.println(price(bar));
    }

    static int isMax(int numb) {
        int max = 0;
        while (numb != 0) {
            max = Math.max(max, (numb % 10));
            numb = numb / 10;
        }
        return max;
    }

    static int price(String barcode) {
        int price = 0;
        for (int i = 0; i < barcode.length(); i++) {
            char ch = barcode.charAt(i);
            if (Character.isDigit(ch)) {
                price += ch - '0';
            } else {
                price += isMax((int) ch);
            }
        }
        return price;
    }
}
