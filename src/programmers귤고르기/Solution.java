package programmers귤고르기;

import java.util.*;

public class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (int key : map.keySet()) {
            list.add(map.get(key));
        }
        list.sort(Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (sum >= k) {
                return i + 1;
            }
        }
        return 0;
    }
}
