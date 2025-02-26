package programmers모의고사;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) {
                count1++;
            }
            if (answers[i] == b[i % 8]) {
                count2++;
            }
            if (answers[i] == c[i % 10]) {
                count3++;
            }
        }

        List<Integer> counts = new ArrayList<>();
        counts.add(count1);
        counts.add(count2);
        counts.add(count3);

        List<Integer> ans = new ArrayList<>();

        int max = counts.stream().max(Integer::compareTo).get();

        for (int i = 0; i < 3; i++) {
            if (counts.get(i) == max) {
                ans.add(i + 1);
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }
}
