package programmers성격유형검사하기;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> a = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            switch (choices[i]) {
                case 1:
                    a.put(c1, a.getOrDefault(c1, 0) + 3);
                    break;
                case 2:
                    a.put(c1, a.getOrDefault(c1, 0) + 2);
                    break;
                case 3:
                    a.put(c1, a.getOrDefault(c1, 0) + 1);
                    break;
                case 5:
                    a.put(c2, a.getOrDefault(c2, 0) + 1);
                    break;
                case 6:
                    a.put(c2, a.getOrDefault(c2, 0) + 2);
                    break;
                case 7:
                    a.put(c2, a.getOrDefault(c2, 0) + 3);
                    break;
            }
        }
        String answer = "";
        answer += a.getOrDefault('R', 0) >= a.getOrDefault('T', 0) ? "R" : "T";
        answer += a.getOrDefault('C', 0) >= a.getOrDefault('F', 0) ? "C" : "F";
        answer += a.getOrDefault('J', 0) >= a.getOrDefault('M', 0) ? "J" : "M";
        answer += a.getOrDefault('A', 0) >= a.getOrDefault('N', 0) ? "A" : "N";

        return answer;
    }
}
