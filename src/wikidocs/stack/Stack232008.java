package wikidocs.stack;

import java.util.Stack;

public class Stack232008 {
    public static void main(String[] args) {
        System.out.println(solution("(())()"));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        if(s.charAt(0) == ')' || s.length() % 2 != 0) {
            return false;
        }

        stack.push(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            if(stack.size() == 0) {
                stack.push(s.charAt(i));
            } else if(stack.peek() == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else if(stack.peek() != s.charAt(i)) {
                stack.pop();
            }
        }

        return stack.size() == 0 ? true : false;
    }
}
