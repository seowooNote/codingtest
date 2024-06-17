package wikidocs.stack;

import java.util.Stack;

public class Stack232009 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static String solution(int decimal) {
        Stack<Integer> stack = new Stack<>();
        while(decimal / 2 != 0) {
            stack.push(decimal % 2);
            decimal /= 2;
            if(decimal == 1) {
                stack.push(1);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.empty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
