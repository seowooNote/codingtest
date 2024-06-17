package wikidocs.stack;

import java.util.Arrays;
import java.util.Stack;

public class Stack232013 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }

    public static int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        Stack<Integer> stack = new Stack<>();


        for(int i = 0; i < prices.length - 1; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[i] > prices[j]) {
                    result[i]++;
                    break;
                } else {
                    result[i]++;
                }
            }
        }

        return result;
    }
}
