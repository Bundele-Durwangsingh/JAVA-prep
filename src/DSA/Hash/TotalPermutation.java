package DSA.Hash;

import java.util.HashMap;
import java.util.Scanner;

public class TotalPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i<string.length();i++){
            int count = map.containsKey(string.charAt(i))?map.get(string.charAt(i)):0;
            map.put(string.charAt(i),count+1);

        }
        int permutation=fact(string.length());
        for(int freq:map.values()){
            permutation/=fact(freq);
        }
        System.out.println(permutation);
        input.close();
    }
    public static int fact(int n){
        if(n==0||n==1)return n;
        return n*fact(n-1);
    }
}
