package greedy;

import java.util.Scanner;

public class BaekJoon10162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int A = T / 300;
        T %= 300;
        int B = T / 60;
        T %= 60;
        int C = T / 10;
        T %= 10;

        if(T == 0) {
            System.out.println(A + " " + B + " " + C);
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }
}
