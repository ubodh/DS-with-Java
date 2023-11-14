package Test;

import java.util.Stack;
class use2 {
    public static void main (String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
       // Stack<Character> ch=new Stack<Character>();
        System.out.println(stack.isEmpty());
        stack.push(101);
        System.out.println(stack.isEmpty());
        
        while(stack.isEmpty())
        {
            stack.push(10);
        }
        System.out.println(stack.pop()+" "+stack.size());
    }
}