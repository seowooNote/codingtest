package search.exhaustive;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] hobits = new int[9];

        for(int i = 0; i < hobits.length; i++) {
            hobits[i] = scanner.nextInt();
            sum += hobits[i];
        }

        Arrays.sort(hobits);
        int a = -1;
        int b = -1;

        for(int i = 0; i < hobits.length - 1; i++) {
            for(int j = i + 1; j < hobits.length; j++) {
                if(sum - (hobits[i] + hobits[j]) == 100) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        for(int i = 0; i < hobits.length; i++) {
            if(i == a || i == b) {
                continue;
            }
            System.out.println(hobits[i]);
        }

        scanner.close();
    }
}
