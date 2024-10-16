package programmers한번만등장한문자;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) == 1) {
                answer += (String.valueOf(c));
            }
        }
        if (answer.isEmpty()) {
            return "";
        }

        for (int i = 0; i < answer.length(); i++) {
            for (int j = 0; j < answer.length(); j++) {
                char target = answer.charAt(i);
                char c = answer.charAt(j);
                if (target < c) {
                    char temp = target;
                    answer = answer.substring(0, i) + c + answer.substring(i + 1);
                    answer = answer.substring(0, j) + temp + answer.substring(j + 1);
                }
            }
        }

        return answer;
    }
}
