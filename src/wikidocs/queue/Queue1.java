package wikidocs.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        int K = scanner.nextInt();

        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < N; i++) {
            queue.add(i + 1);
        }

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll() > queue.peek());


//        while(queue.size() > 1) {
//            for(int i = 0; i < K; i++) {
//                if(i == K - 1) {
//                    queue.poll();
//                } else {
//                    queue.add(queue.poll());
//                }
//            }
//        }

        scanner.close();
    }
}
