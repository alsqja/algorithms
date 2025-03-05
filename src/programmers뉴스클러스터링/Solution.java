package programmers뉴스클러스터링;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String str1, String str2) {
        int sum = 0;
        int both = 0;

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        makeMap(str1, map1);
        makeMap(str2, map2);

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int count1 = map1.get(key);
                int count2 = map2.get(key);
                int max = Math.max(count1, count2);
                int min = Math.min(count1, count2);

                sum += max;
                both += min;
            } else {
                sum += map1.get(key);
            }
        }

        for (String key : map2.keySet()) {
            if (!map1.containsKey(key)) {
                sum += map2.get(key);
            }
        }

        System.out.println(sum);
        System.out.println(both);

        if (sum == 0) {
            return 65536;
        }

        return (int) ((double) both / (double) sum * 65536);
    }

    private void makeMap(String str, Map<String, Integer> map) {
        for (int i = 0; i < str.length() - 1; i++) {
            if ((int) str.charAt(i) >= (int) 'a' && (int) str.charAt(i) <= (int) 'z' && (int) str.charAt(i + 1) >= (int) 'a' && str.charAt(i + 1) <= (int) 'z') {
                map.put(str.substring(i, i + 2), map.getOrDefault(str.substring(i, i + 2), 0) + 1);
            }
        }
    }
}


//  3.25ms -> 1.99ms