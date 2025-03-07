package programmers서버증설횟수;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int server = 0;
        Queue<Integer> servers = new LinkedList<>();

        for (int i = 0; i < 24; i++) {
            while (!servers.isEmpty() && servers.peek() <= i) {
                servers.poll();
                server--;
            }

            int required = players[i] / m;

            if (required > server) {
                int newServer = required - server;
                answer += newServer;
                server = required;

                for (int j = 0; j < newServer; j++) {
                    servers.offer(i + k);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5}, 3, 5));
    }
}
