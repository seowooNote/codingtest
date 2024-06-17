package wikidocs.stack;

import java.util.Stack;

public class Stack232014 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
        System.out.println(solution("cdcd"));
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int result = 0;
        stack.push(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            if(stack.size() == 0) {
                stack.push(s.charAt(i));
            } else if(stack.peek() == s.charAt(i)) {
                stack.pop();
            } else if(stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            }
        }

        return stack.size() == 0 ? 1: 0;
    }
}
