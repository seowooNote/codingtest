package greedy;

import java.util.Scanner;

public class BaekJoon1343 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String answer = "";

        String A = "AAAA";
        String B = "BB";

        str = str.replaceAll("XXXX", A);
        answer = str.replaceAll("XX", B);

        if(answer.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }

        scanner.close();
    }
}
