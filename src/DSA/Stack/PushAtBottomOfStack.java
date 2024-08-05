package DSA.Stack;

import java.util.Stack;

public class PushAtBottomOfStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        PushAtBottom(stack,4);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void PushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp =s.pop();
        PushAtBottom(s,data);
        s.push(temp);
    }
}
