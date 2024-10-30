package programmers신고결과받기;

import java.util.*;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> reportCount = new HashMap<>();
        Map<String, List<String>> member = new HashMap<>();   //  신고당한사람 : 신고한사람들

        for (String s : id_list) {
            reportCount.put(s, 0);
            member.put(s, new ArrayList<>());
        }

        for (String r : report) {
            String[] arr = r.split(" ");
            if (!member.get(arr[1]).contains(arr[0])) {
                reportCount.put(arr[1], reportCount.get(arr[1]) + 1);
                member.get(arr[1]).add(arr[0]);
            }
        }
        int[] answer = new int[id_list.length];

        for (String key : reportCount.keySet()) {
            if (reportCount.get(key) >= k) {
                for (String m : member.get(key)) {
                    answer[Arrays.asList(id_list).indexOf(m)]++;
                }
            }
        }
        return answer;
    }
}
