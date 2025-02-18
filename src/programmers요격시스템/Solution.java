package programmers요격시스템;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, Comparator.comparingInt(o -> o[1]));

        int count = 0;
        int lastShot = -1;

        for (int[] target : targets) {
            int start = target[0];
            int end = target[1];

            if (lastShot < start) {
                count++;
                lastShot = end - 1;
            }
        }

        return count;
    }
}
