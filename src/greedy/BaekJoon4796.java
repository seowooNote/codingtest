package greedy;

import java.util.Scanner;

public class BaekJoon4796 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(true) {
            int L = scanner.nextInt();
            int P = scanner.nextInt();
            int V = scanner.nextInt();

            if(L == 0 && P == 0 && V == 0) break;

            int a = V / P;
            int b = L * a;
            int c = V - P * a > 0 ? V - P * a : 0;

            i++;
            System.out.println("Case " + i + ": " + (b + c));

        }

        scanner.close();
    }
}
