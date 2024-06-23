import java.util.Arrays;

public class PassinginArray {
    public static void main(String[] args) {
        int [] OriginaArray = {0,1,2,3,4};
        System.out.println("Original Array before passing Value");
        System.out.println(Arrays.toString(OriginaArray));
        Change(OriginaArray);
        System.out.println("Changed Array after passing Value");
        System.out.println(Arrays.toString(OriginaArray));

    }
    static void Change(int [] Change){
        Change[0]=99;
    }
}
