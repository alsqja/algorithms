package programmers할인행사;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int count = 0;
        while (count + 10 <= discount.length) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = count; i < count + 10; i++) {
                map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
            }
            boolean isWant = true;

            for (int i = 0; i < want.length; i++) {
                if (map.getOrDefault(want[i], 0) < number[i]) {
                    isWant = false;
                    break;
                }
            }

            if (isWant) {
                answer++;
            }

            count++;
        }
        return answer;
    }
}
