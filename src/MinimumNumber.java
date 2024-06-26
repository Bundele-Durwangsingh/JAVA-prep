public class MinimumNumber {
    public static void main(String[] args) {
        int [] arr ={23,12,34,456,756,8,90};
        System.out.println(Minimum(arr));
    }
    static int Minimum(int [] arr){
        int answer =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<answer){
                answer=arr[i];
            }
        }
        return answer;
    }
}
