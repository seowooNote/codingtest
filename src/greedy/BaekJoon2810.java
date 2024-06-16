package greedy;

import java.util.Scanner;

public class BaekJoon2810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();

        StringBuilder sb = new StringBuilder("*");
        int answer = 1;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'S') {
                sb.append("S");
            }else if(S.charAt(i) == 'L') {
                sb.append("LL");
                i++;
            }
            sb.append("*");
            answer++;
        }
        System.out.println(Math.min(answer, S.length()));
    }
}
