package wikidocs.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array231997 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split(", ");
        int[] intArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        scanner.close();
    }
}
