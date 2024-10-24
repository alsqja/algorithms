package programmers카드뭉치;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();

        Collections.addAll(q1, cards1);
        Collections.addAll(q2, cards2);

        for (String g : goal) {
            if (!q1.isEmpty() && q1.peek().equals(g)) {
                q1.poll();
            } else if (!q2.isEmpty() && q2.peek().equals(g)) {
                q2.poll();
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
