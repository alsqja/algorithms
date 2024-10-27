package programmers대충만든자판;

import java.util.Arrays;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            for (char c : targets[i].toCharArray()) {
                int min = 102;
                for (String key : keymap) {
                    if (min > key.indexOf(c) + 1 && key.indexOf(c) != -1) {
                        min = key.indexOf(c) + 1;
                    }
                }
                if (min == 102) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += min;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"BC"}, new String[]{"AC", "BC"})));
    }
}
