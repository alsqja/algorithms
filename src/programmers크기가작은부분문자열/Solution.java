package programmers크기가작은부분문자열;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        int answer = 0;

        List<Long> parts = new ArrayList<>();

        for (int i = 0; i < t.length() - len + 1; i++) {
            parts.add(Long.parseLong(t.substring(i, i + len)));
        }
        System.out.println(parts);
        long numberP = Long.parseLong(p);

        for (Long part : parts) {
            if (part <= numberP) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String t = "10203";
        String p = "15";

        Solution sol = new Solution();

        System.out.println(sol.solution(t, p));
    }
}
