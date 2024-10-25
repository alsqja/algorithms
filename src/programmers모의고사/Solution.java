package programmers모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) {
                aCount++;
            }
            if (answers[i] == b[i % 8]) {
                bCount++;
            }
            if (answers[i] == c[i % 10]) {
                cCount++;
            }
        }

        int max = Math.max(Math.max(aCount, bCount), cCount);

        List<Integer> list = new ArrayList<>();
        if (aCount == max) {
            list.add(1);
        }
        if (bCount == max) {
            list.add(2);
        }
        if (cCount == max) {
            list.add(3);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] answers = {1, 3, 2, 4, 2};

        System.out.println(Arrays.toString(solution.solution(answers)));
    }
}
