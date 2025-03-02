package programmers캐시;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int cacheSize, String[] cities) {

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        List<String> queue = new ArrayList<>();
        int answer = 0;

        for (String city : cities) {
            city = city.toLowerCase();
            if (queue.contains(city)) {
                queue.remove(city);
                queue.add(city);
                answer++;
            } else {
                if (queue.size() >= cacheSize) {
                    queue.remove(0);
                }
                queue.add(city);
                answer += 5;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, new String[]{"a", "b", "a", "c", "d", "a"}));
    }
}
