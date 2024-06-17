package wikidocs.array;

import java.util.HashMap;

public class Array231994 {
    public static void main(String[] args) {
        failure(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }

    public static int[] failure(int N, int[] stages) {
        int[] result = new int[N];
        HashMap<Integer, Double> hashMap = new HashMap<>();

        for(int i = 0; i < N; i++) {
            int attempt = 0;
            int unClear = 0;
            for(int j = 0; j < stages.length; j++) {
                if(i + 1 == stages[j]) {
                    attempt++;
                    unClear++;
                } else if(i + 1 > stages[j]) {
                    attempt++;
                }
                hashMap.put(i + 1, (double) unClear / (double) attempt);
            }
        }

        System.out.println(hashMap);



        return null;
    }

}
