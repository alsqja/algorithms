package programmers의상;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (String[] c : clothes) {
            map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        }

        int answer = 1;
        for (int value : map.values()) {
            answer *= value + 1;
        }

        return answer - 1;
    }
}
