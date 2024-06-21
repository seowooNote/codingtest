package greedy;

import java.util.Scanner;

public class BaekJoon5585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = 1000 - scanner.nextInt();
        int A = M / 500;
        M %= 500;
        int B = M / 100;
        M %= 100;
        int C = M / 50;
        M %= 50;
        int D = M / 10;
        M %= 10;
        int E = M / 5;
        M %= 5;
        int F = M / 1;

        System.out.println(A + B + C + D + E + F);

        scanner.close();
    }
}
