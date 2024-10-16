package programmers자연수뒤집어배열로만들기;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(long n) {
        Queue<Integer> queue = new LinkedList<>();

        while (n > 0) {
            queue.add((int) (n % 10));
            n = n / 10;
        }
        int[] answer = new int[queue.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }
        return answer;
    }
}
