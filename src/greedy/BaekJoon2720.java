package greedy;

import java.util.Scanner;

public class BaekJoon2720 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i = 0; i < T; i++) {
            int C = scanner.nextInt();
            int quarter = C / 25;
            C %= 25;
            int dime = C / 10;
            C %= 10;
            int nickel = C / 5;
            C %= 5;
            int penny = C;
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }

    }
}
