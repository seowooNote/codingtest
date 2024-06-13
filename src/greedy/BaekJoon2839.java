package greedy;

import java.util.Scanner;

public class BaekJoon2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        while(N > 0) {
            if(N % 5 == 0) {
                count += (N / 5);
                break;
            }
            if(N < 3) {
                System.out.println(-1);
                break;
            }
            N -= 3;
            count++;
        }

        System.out.println(count);

        scanner.close();
    }
}
