package wikidocs.hash;


import java.util.HashSet;
import java.util.Set;

public class Hash1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 8}, 6));
        System.out.println(solution(new int[]{1, 2, 3, 4, 8}, 10));
        System.out.println(solution(new int[]{2, 3, 5, 9}, 10));
    }

    public static boolean solution(int[] arr, int target) {
        Set<Integer> hashSet = new HashSet<>();

        for(int i : arr) {
            if(hashSet.contains(target - i)) {
                return true;
            }
            hashSet.add(i);
        }

        return false;
    }
}
