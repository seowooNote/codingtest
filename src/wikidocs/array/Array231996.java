package wikidocs.array;

import java.util.*;

public class Array231996 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split(", ");
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(String s : strArr) {
            set.add(Integer.parseInt(s));
        }
        for(int i : set) {
            list.add(i);
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        scanner.close();
    }
}
