package programmers프로세스;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> q = new LinkedList<>();

        for (int i : priorities) {
            q.add(i);
        }

        int count = 0;
        while (!q.isEmpty()) {
            int max = 0;
            for (int i : q) {
                if (i > max) {
                    max = i;
                }
            }

            int num = q.poll();
            if (num == max) {
                count++;
                if (location == 0) {
                    return count;
                }
            } else {
                q.add(num);
                if (location < 0) {
                    location = q.size() - 1;
                }
            }
            location--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
