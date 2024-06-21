package wikidocs.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue159994 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> a = new ArrayDeque<>();
        Queue<String> b = new ArrayDeque<>();
        Queue<String> c = new ArrayDeque<>();

        for(int i = 0; i < cards1.length; i++) {
            a.add(cards1[i]);
        }
        for(int i = 0; i < cards2.length; i++) {
            b.add(cards2[i]);
        }
        for(int i = 0; i < goal.length; i++) {
            c.add(goal[i]);
        }

        String answer = "";

        while(!c.isEmpty()) {
            if(!c.peek().equals(a.peek()) && !c.peek().equals(b.peek())) {
                answer = "No";
                break;
            } else if(c.peek().equals(a.peek())) {
                c.poll();
                a.poll();
            } else if(c.peek().equals(b.peek())) {
                c.poll();
                b.poll();
            }

            if(c.isEmpty()) {
                answer = "Yes";
                break;
            }
        }

        return answer;
    }
}
