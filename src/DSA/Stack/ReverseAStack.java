package DSA.Stack;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Revrese(stack);
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
    public static void Revrese(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        } 
        int top= s.pop();
        Revrese(s);
        PushAtBottom(s, top);
    }
}
