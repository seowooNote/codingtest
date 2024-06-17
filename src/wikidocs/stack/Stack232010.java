package wikidocs.stack;

import java.util.Arrays;
import java.util.Stack;

public class Stack232010 {
    public static void main(String[] args) {
        System.out.println(solution(
                new int[][] {{0 ,0 ,0 ,0 ,0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}},
                new int[] {1, 5, 3, 5, 1, 2, 1, 4}
        ));
    }

    public static int solution(int[][] board, int[] moves) {
        Stack<Integer>[] stacks = new Stack[board.length];
        for(int i = 0; i < board.length; i++) {
            stacks[i] = new Stack<>();
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] != 0) {
                    stacks[i].push(board[i][j]);
                }
            }
            System.out.println(stacks[i]);
        }

        System.out.println(Arrays.toString(moves));

        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < moves.length; i++) {
            if(stacks[moves[i] - 1].size() == 0) {
                continue;
            }

            if(stack.size() == 0 && stacks[moves[i] - 1].size() != 0) {
                stack.push(stacks[moves[i] - 1].pop());
            } else if(stack.peek() == stacks[moves[i] - 1].peek()) {
                stack.pop();
                stacks[moves[i] - 1].pop();
                result += 2;
            } else if(stack.peek() != stacks[moves[i] - 1].peek()) {
                stack.push(stacks[moves[i] - 1].pop());
            }
        }

        return result;
    }

}
