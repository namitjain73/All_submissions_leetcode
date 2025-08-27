// Last updated: 8/28/2025, 2:51:27 AM
import java.util.Stack;
class Solution {
    public int evalRPN(String[] tokens) {
        return value(tokens);
        
    }
    public static boolean isInteger(String s){
        return s.matches("^[+-]?\\d+$");
    }
    public static int value(String[] arr){
        Stack<Integer> stack = new Stack<>();
        for(String item:arr){
            if(isInteger(item)){
                stack.push(Integer.parseInt(item));
            }
            else {
                int b = stack.pop();
                int a = stack.pop();
                switch(item){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
                    

                
            }
        }
        return stack.pop();
    }
}