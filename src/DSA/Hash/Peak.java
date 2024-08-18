package DSA.Hash;
import java.util.HashMap;
import java.util.Scanner;
public class Peak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] arr= new int[n];
        int max= 0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
            int count=map.containsKey(arr[i])?map.get(arr[i]):0;
            map.put(arr[i],count+1);
        }
        for(int key :map.keySet()){
            if((key==max && map.get(key)>1)||map.get(key)>2){
                System.out.println("False");
                System.exit(0);
            }
        }
        System.out.println("True");
        input.close();
    }
}
