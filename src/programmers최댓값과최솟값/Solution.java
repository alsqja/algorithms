package programmers최댓값과최솟값;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        int[] arr = Arrays.stream(s.split(" ")).map((Integer::parseInt)).mapToInt(i -> i).toArray();

        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return min + " " + max;
    }
}
