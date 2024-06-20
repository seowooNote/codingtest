package wikidocs.queue;

import java.util.*;

public class Queue42586 {
    public static void main(String[] args) {
        int[] arr = solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++) {
            queue.add(
                    (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1
            );
        }

        int count = 1;
        int target = queue.poll();
        while(!queue.isEmpty()) {
            if(target >= queue.peek()) {
                queue.poll();
                count++;
            } else if(target < queue.peek()) {
                target = queue.poll();
                list.add(count);
                count = 1;
            }

            if(queue.isEmpty()) {
                list.add(count);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
