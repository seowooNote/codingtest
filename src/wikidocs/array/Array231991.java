package wikidocs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array231991 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(topScore(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(topScore(new int[]{1, 3, 2, 4, 2})));

    }

    public static int[] topScore(int[] answers) {
        // [1, 2, 3, 4, 5]
        int[][] people = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] score = new int[3];
        for(int i = 0; i < people.length; i++) {
            for(int j = 0; j < answers.length; j++) {
                if(answers[j] == people[i][j]) {
                    score[i]++;
                }
            }
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(score[i] == maxScore) {
                arrayList.add(i + 1);
            }
        }

        int[] answer = new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }


}
