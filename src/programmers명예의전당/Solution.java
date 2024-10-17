package programmers명예의전당;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> best = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (best.size() < k) {
                best.add(score[i]);
                Collections.sort(best);
                answer.add(best.get(0));
            } else {
                Collections.sort(best);
                if (best.get(0) < score[i]) {
                    best.remove(0);
                    best.add(0, score[i]);
                    Collections.sort(best);
                }
                answer.add( best.get(0));
            }
        }
        int[] finalArr = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            finalArr[i] = answer.get(i);
        }
        return finalArr;
    }
}
