package programmers가장가까운같은글자;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                answer[i] = -1;
            } else if (map.get(s.charAt(i)) >= i) {
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(s.charAt(i));
            }
            map.put(s.charAt(i), i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";
        Solution solution = new Solution();
        int[] answer = solution.solution(s);

        System.out.println(Arrays.toString(answer));
    }
}
