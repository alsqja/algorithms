package programmers3진법뒤집기;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int n) {
        Queue<Integer> q = new LinkedList<>();

        while (n > 0) {
            q.add(n % 3);
            n /= 3;
        }

        int answer = 0;
        while (!q.isEmpty()) {
            answer += q.poll() * (int) Math.pow(3, q.size());
        }
        return answer;
    }
}
