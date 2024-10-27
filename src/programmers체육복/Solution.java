package programmers체육복;

import java.util.Arrays;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = Arrays.stream(new int[n]).map(i -> 1).toArray();
        for (int l : lost) {
            arr[l - 1]--;
        }
        for (int r : reserve) {
            arr[r - 1]++;
        }

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer++;
            if (arr[i] == 0) {
                answer--;
                if (i == 0) {
                    if (arr[i + 1] > 1) {
                        answer++;
                        arr[i + 1]--;
                    }
                } else if (i == arr.length - 1) {
                    if (arr[i - 1] > 1) {
                        answer++;
                        arr[i - 1]--;
                    }
                } else if (arr[i - 1] > 1) {
                    answer++;
                    arr[i - 1]--;
                } else if (arr[i + 1] > 1) {
                    answer++;
                    arr[i + 1]--;
                }
            }
        }
        return answer;
    }
}
