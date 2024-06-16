package wikidocs.array;

import java.util.*;

public class Array232065 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(add(new int[]{1, 2, 3})));
    }

    public static int[] add(int[] intArr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < intArr.length - 1; i++) {
            for(int j = i + 1; j < intArr.length; j++) {
                set.add(intArr[i] + intArr[j]);
            }
        }
        for(int a : set) {
            list.add(a);
        }
        Collections.sort(list);
        int[] newArr = new int[list.size()];
        for(int i = 0; i < newArr.length; i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }
}
