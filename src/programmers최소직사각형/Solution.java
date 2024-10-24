package programmers최소직사각형;

public class Solution {
    public int solution(int[][] size) {
        int maxMax = 0;
        int minMax = 0;

        for (int[] arr : size) {
            int max = Math.max(arr[0], arr[1]);
            int min = Math.min(arr[0], arr[1]);

            if (max > maxMax) {
                maxMax = max;
            }
            if (min > minMax) {
                minMax = min;
            }
        }

        return maxMax * minMax;
    }
}
