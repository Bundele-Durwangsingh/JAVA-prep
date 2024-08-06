package DSA.String;

public class AlternateCasing {
    public static void main(String[] args) {
        String s = "helloworld";
        String SUpper = s.toUpperCase();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = SUpper.charAt(i);
            if (i % 2 == 0) {
                result = result+Character.toUpperCase(ch) ;
            }else{
                result =result+Character.toLowerCase(ch);
            }
        }
        System.out.println(result);
    }
}
