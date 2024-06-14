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
            scanner.nextLine();

            if(L == 0 && P == 0 && V == 0) {
                scanner.close();
                break;
            }

            i++;
            int answer = 0;

            if(V % P > L) {
                answer = (L * (V / P)) + L;
            } else {
                answer = (L * (V / P)) + (V % P);
            }
            System.out.println("Case " + i + ": " + answer);
        }
    }
}
